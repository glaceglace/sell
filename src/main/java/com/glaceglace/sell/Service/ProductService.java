package com.glaceglace.sell.Service;

import com.glaceglace.sell.DTO.CartDTO;
import com.glaceglace.sell.Entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {


    ProductInfo findOne(String productId);

    /**
     * find all products on stock
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**
     * add stock
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * remove stock
     */
    void decreaseStock(List<CartDTO> cartDTOList);


}
