package com.glaceglace.sell.Form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class OrderForm {

    /**
     * buyers name
     */
    @NotEmpty(message = "Name")
    private String name;

    @NotEmpty(message = "Phone number")
    private String phone;

    @NotEmpty(message = "address")
    private String address;

    @NotEmpty(message = "openid")
    private String openid;

    @NotEmpty(message = "cart cant be empty")
    private String items;


}
