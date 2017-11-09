package com.glaceglace.sell.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;

    private Integer productStock;
    private String productDescription;
    private String productIcon;
    /**
     * 0 normal, 1 offstock
     */
    private Integer productStatus;
    private Integer categoryType;


}
