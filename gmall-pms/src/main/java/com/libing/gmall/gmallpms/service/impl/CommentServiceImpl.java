package com.libing.gmall.gmallpms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.libing.gmall.gmallpms.entity.Comment;
import com.libing.gmall.gmallpms.mapper.CommentMapper;
import com.libing.gmall.gmallpms.service.CommentService;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-01-08
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
