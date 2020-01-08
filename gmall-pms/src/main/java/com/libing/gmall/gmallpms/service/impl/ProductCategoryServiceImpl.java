package com.libing.gmall.gmallpms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.libing.gmall.gmallpms.entity.ProductCategory;
import com.libing.gmall.gmallpms.mapper.ProductCategoryMapper;
import com.libing.gmall.gmallpms.service.ProductCategoryService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-08
 */
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

}
