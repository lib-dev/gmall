package com.libing.gmall.gmallpms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.libing.gmall.gmallpms.entity.ProductLadder;
import com.libing.gmall.gmallpms.mapper.ProductLadderMapper;
import com.libing.gmall.gmallpms.service.ProductLadderService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-08
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderService {

}
