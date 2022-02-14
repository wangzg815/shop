package com.wz.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wz.common.utils.PageUtils;
import com.wz.mall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author wangzhigang
 * @email 719199237@qq.com
 * @date 2021-12-27 11:48:07
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

