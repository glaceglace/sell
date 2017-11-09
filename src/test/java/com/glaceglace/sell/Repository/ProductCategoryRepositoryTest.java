package com.glaceglace.sell.Repository;

import com.glaceglace.sell.Entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory =  repository.findOne(1);
        System.out.println(productCategory.toString());
    }
    @Test
    @Transactional//测试类中测试完直接回滚
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("birls favorite", 2);
        ProductCategory result=repository.save(productCategory);
        Assert.assertNotEquals(null, result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4,5,6);
        List<ProductCategory> result= repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result);
    }

}