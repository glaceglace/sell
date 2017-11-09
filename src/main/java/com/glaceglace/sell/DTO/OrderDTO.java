package com.glaceglace.sell.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.glaceglace.sell.Entity.OrderDetail;
import com.glaceglace.sell.Utils.Serializer.Data2LongSerializer;
import com.glaceglace.sell.enums.OrderStatusEnum;
import com.glaceglace.sell.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

    @JsonSerialize(using =Data2LongSerializer.class)
    private Date createTime;

    @JsonSerialize(using =Data2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

}
