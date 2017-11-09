package com.glaceglace.sell.Converter;

import com.glaceglace.sell.DTO.OrderDTO;
import com.glaceglace.sell.Entity.OrderMaster;
import org.springframework.beans.BeanUtils;

public class OrderDTO2OrderMasterConverter {
    public static OrderMaster convert(OrderDTO orderDTO){
        OrderMaster orderMaster = new OrderMaster();
        BeanUtils.copyProperties(orderDTO, orderMaster);
        return orderMaster;
    }
}
