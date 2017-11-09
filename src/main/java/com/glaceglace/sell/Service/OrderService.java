package com.glaceglace.sell.Service;

import com.glaceglace.sell.DTO.OrderDTO;
import com.glaceglace.sell.Entity.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {

    /**
     * create order
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * find single order
     */
    OrderDTO findOne(String orderId);

    /**
     * find order list
     */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /**
     * cancel order
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * finish order
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * pay order
     */
    OrderDTO paid(OrderDTO orderDTO);
}
