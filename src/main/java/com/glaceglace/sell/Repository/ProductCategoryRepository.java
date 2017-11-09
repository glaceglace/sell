package com.glaceglace.sell.Repository;

import com.glaceglace.sell.Entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{
    /**
     * 根据多个CategoryType一次性查找多个数据，返回为一个List
     * @param categoryTypeList
     * @return List<ProductCategory>
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
