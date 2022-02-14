package com.wz.mall.product.dao;

import com.wz.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangzhigang
 * @email 719199237@qq.com
 * @date 2021-12-23 17:09:33
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
