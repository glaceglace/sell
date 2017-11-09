package com.glaceglace.sell.Repository;

import com.glaceglace.sell.Entity.OrderDetail;
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
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;
    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetails = repository.findByOrderId("2323232");
        System.out.println(orderDetails.toString());
        Assert.assertNotEquals(0,orderDetails.size());
    }

    @Test
    public void save() {

        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setDetailId("12344511");
        orderDetail.setOrderId("2323232");
        orderDetail.setProductIcon("XXXXX.JPG");
        orderDetail.setProductId("1111123");
        orderDetail.setProductName("THIS IS Q NAME");
        orderDetail.setProductPrice(new BigDecimal(1000));
        orderDetail.setProductQuantity(3);
        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

}