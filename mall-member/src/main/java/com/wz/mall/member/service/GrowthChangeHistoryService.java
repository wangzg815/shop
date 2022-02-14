package com.wz.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wz.common.utils.PageUtils;
import com.wz.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author wangzhigang
 * @email 719199237@qq.com
 * @date 2021-12-27 11:07:58
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

