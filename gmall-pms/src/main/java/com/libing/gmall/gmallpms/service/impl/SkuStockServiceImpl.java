package com.libing.gmall.gmallpms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.libing.gmall.gmallpms.entity.SkuStock;
import com.libing.gmall.gmallpms.mapper.SkuStockMapper;
import com.libing.gmall.gmallpms.service.SkuStockService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * sku的库存 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-08
 */
@Service
public class SkuStockServiceImpl extends ServiceImpl<SkuStockMapper, SkuStock> implements SkuStockService {

}
