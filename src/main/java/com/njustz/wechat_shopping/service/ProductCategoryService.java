package com.njustz.wechat_shopping.service;

import com.njustz.wechat_shopping.entity.ProductCategory;

import java.util.List;

/**
 * @author njustz
 * @date 2019/5/26
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer productCategoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
