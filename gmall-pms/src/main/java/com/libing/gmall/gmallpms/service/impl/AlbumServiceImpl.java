package com.libing.gmall.gmallpms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.libing.gmall.gmallpms.entity.Album;
import com.libing.gmall.gmallpms.mapper.AlbumMapper;
import com.libing.gmall.gmallpms.service.AlbumService;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-08
 */
@Service
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}
