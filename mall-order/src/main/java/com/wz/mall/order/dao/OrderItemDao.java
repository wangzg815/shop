package com.wz.mall.order.dao;

import com.wz.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wangzhigang
 * @email 719199237@qq.com
 * @date 2021-12-27 11:48:07
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
