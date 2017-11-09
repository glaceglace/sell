package com.glaceglace.sell.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10,"The product doesn't exist"),
    PRODUCT_STOCK_ERRO(11, "Product stock error"),
    ORDER_NOT_EXIST(12, "Order doesn't exist"),
    ORDER_DETAIL_NOT_EXIST(13, "Order detail doesn't exist"),
    ORDER_STATUS_ERROR(14, "ERROR on order status"),
    ORDER_UPDATE_FAIL(15,"Failed to update order"),
    ORDER_DETAIL_EMPTY(16,"The order is empty"),
    ORDER_PAYMENT_STATUS_ERROR(17, "Error on payment status"),
    PARAM_ERROR(1, "Invalid arguments"),
    CART_EMPTY_ERROR(18, "Cart cant be empty"),
    ORDER_OWNER_ERROR(19,"owner error")


    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }




}
