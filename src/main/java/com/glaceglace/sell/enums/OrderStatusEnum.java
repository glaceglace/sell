package com.glaceglace.sell.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {

    NEW(0,"New order"),
    FINISHED(1,"Finished order"),
    CANCEL(2, "Cancelled order");

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
