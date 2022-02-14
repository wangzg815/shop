package com.wz.mall.member.dao;

import com.wz.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangzhigang
 * @email 719199237@qq.com
 * @date 2021-12-27 11:07:58
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
