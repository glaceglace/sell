package com.glaceglace.sell.Repository;

import com.glaceglace.sell.Entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> result = repository.findByProductStatus(0);
        Assert.assertNotEquals(0, result.size());
    }
    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("12345");
        productInfo.setProductName("Soup");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("nice to drink");
        productInfo.setProductIcon("jgeijegellle");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(5);
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }

}