package com.glaceglace.sell.enums;


import lombok.Getter;

@Getter
public enum ProductStatusEnum {
    UP(0, "On stock"),
    DOWN(1, "No stock"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
