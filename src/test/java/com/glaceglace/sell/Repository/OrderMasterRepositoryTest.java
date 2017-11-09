package com.glaceglace.sell.Repository;

import com.glaceglace.sell.Entity.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void save(){

        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1233434323");
        orderMaster.setBuyerName("MOOOC");
        orderMaster.setBuyerPhone("111111111111");
        orderMaster.setBuyerAddress("MOOCWEB");
        orderMaster.setBuyerOpenid("113113");
        orderMaster.setOrderAmount(new BigDecimal(233));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);

    }
    @Test
    public void findByOrderId() throws Exception {
        PageRequest request = new PageRequest(1,3);
        Page<OrderMaster> result = repository.findByBuyerOpenid("113113", request);
        System.out.println(result.getTotalElements());
        Assert.assertNotEquals(0, result.getTotalElements());
    }

}