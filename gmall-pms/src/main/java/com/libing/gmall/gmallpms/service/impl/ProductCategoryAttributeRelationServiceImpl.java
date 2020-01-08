package com.libing.gmall.gmallpms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.libing.gmall.gmallpms.entity.ProductCategoryAttributeRelation;
import com.libing.gmall.gmallpms.mapper.ProductCategoryAttributeRelationMapper;
import com.libing.gmall.gmallpms.service.ProductCategoryAttributeRelationService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-08
 */
@Service
public class ProductCategoryAttributeRelationServiceImpl extends ServiceImpl<ProductCategoryAttributeRelationMapper, ProductCategoryAttributeRelation> implements ProductCategoryAttributeRelationService {

}
