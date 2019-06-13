package com.njustz.wechat_shopping.service.impl;

import com.njustz.wechat_shopping.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productInfoService.findOne("123456");
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfos = productInfoService.findUpAll();
        Assert.assertNotEquals(0, productInfos.size());
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = productInfoService.findAll(request);
        //System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("chicken");
        productInfo.setProductPrice(new BigDecimal(6.0));
        productInfo.setProductStock(1000);
        productInfo.setProductDescription("good");
        productInfo.setProductIcon("112.jpg");
        productInfo.setCategoryType(3);
        ProductInfo productInfo1 = productInfoService.save(productInfo);
        Assert.assertNotNull(productInfo1);
    }
}