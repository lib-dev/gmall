package com.libing.gmall.gmallpms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.libing.gmall.gmallpms.entity.ProductAttribute;
import com.libing.gmall.gmallpms.mapper.ProductAttributeMapper;
import com.libing.gmall.gmallpms.service.ProductAttributeService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 商品属性参数表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-08
 */
@Service
public class ProductAttributeServiceImpl extends ServiceImpl<ProductAttributeMapper, ProductAttribute> implements ProductAttributeService {

}
