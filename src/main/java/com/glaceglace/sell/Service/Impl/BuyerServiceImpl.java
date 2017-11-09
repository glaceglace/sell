package com.glaceglace.sell.Service.Impl;

import com.glaceglace.sell.DTO.OrderDTO;
import com.glaceglace.sell.Exceptions.SellException;
import com.glaceglace.sell.Service.BuyerService;
import com.glaceglace.sell.Service.OrderService;
import com.glaceglace.sell.enums.ResultEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        return checkOwnerOrder(openid,orderId);

    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        OrderDTO orderDTO = checkOwnerOrder(openid, orderId);
        if(orderDTO == null){
            log.error("Cant find order orderId = {}", orderId);
            throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
        }
        return orderService.cancel(orderDTO);
    }
    private OrderDTO checkOwnerOrder(String openid, String orderId){
        OrderDTO orderDTO = orderService.findOne(orderId);
        if(orderDTO == null) {
            return null;
        }


        if (!orderDTO.getBuyerOpenid().equals(openid)) {
            log.error("Order search error, openid not matched, openid ={}, orderDTO = {} ", openid, orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }
        return orderDTO;
    }
}
