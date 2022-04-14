package com.ponymall.coupon.dao;

import com.ponymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hljuczh@163.com
 * @email hljuczh@163.com
 * @date 2022-04-07 15:04:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
