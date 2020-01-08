package com.libing.gmall.gmallpms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.libing.gmall.gmallpms.entity.ProductAttributeCategory;
import com.libing.gmall.gmallpms.mapper.ProductAttributeCategoryMapper;
import com.libing.gmall.gmallpms.service.ProductAttributeCategoryService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 产品属性分类表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-08
 */
@Service
public class ProductAttributeCategoryServiceImpl extends ServiceImpl<ProductAttributeCategoryMapper, ProductAttributeCategory> implements ProductAttributeCategoryService {

}
