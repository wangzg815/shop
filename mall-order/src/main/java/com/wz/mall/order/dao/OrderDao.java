package com.wz.mall.order.dao;

import com.wz.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangzhigang
 * @email 719199237@qq.com
 * @date 2021-12-27 11:48:07
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
