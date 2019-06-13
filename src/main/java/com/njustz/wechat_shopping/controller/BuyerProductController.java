package com.njustz.wechat_shopping.controller;

import com.njustz.wechat_shopping.entity.ProductCategory;
import com.njustz.wechat_shopping.entity.ProductInfo;
import com.njustz.wechat_shopping.service.ProductCategoryService;
import com.njustz.wechat_shopping.service.ProductInfoService;
import com.njustz.wechat_shopping.utils.ResultVOUtil;
import com.njustz.wechat_shopping.viewobject.ProductInfoVO;
import com.njustz.wechat_shopping.viewobject.ProductVO;
import com.njustz.wechat_shopping.viewobject.ReslutVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author njustz
 * @date 2019/5/27
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ReslutVO list(){
        //1.查询所有的上架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        //2.查讯类目（一次性查询）
        //传统方法
      /*  List<Integer> categoryTypeList = new ArrayList<>();
          for(ProductInfo productInfo:productInfoList){
            categoryTypeList.add(productInfo.getCategoryType());
        }*/                                                                                           

        //lambda表达式
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());

        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);

        List<ProductVO> productVOList = new ArrayList<>();
        //3.数据拼装
        for(ProductCategory productCategory:productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for(ProductInfo productInfo:productInfoList){
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }

            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }
}
