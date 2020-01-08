package com.libing.gmall.gmallpms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.libing.gmall.gmallpms.entity.ProductAttributeValue;
import com.libing.gmall.gmallpms.mapper.ProductAttributeValueMapper;
import com.libing.gmall.gmallpms.service.ProductAttributeValueService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 存储产品参数信息的表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-08
 */
@Service
public class ProductAttributeValueServiceImpl extends ServiceImpl<ProductAttributeValueMapper, ProductAttributeValue> implements ProductAttributeValueService {

}
