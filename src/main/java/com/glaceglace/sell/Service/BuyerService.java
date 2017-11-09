package com.glaceglace.sell.Service;

import com.glaceglace.sell.DTO.OrderDTO;

public interface BuyerService {

    //find one order
    OrderDTO findOrderOne(String openid, String orderId);

    //cancel order
    OrderDTO cancelOrder(String openid, String orderId);

}
