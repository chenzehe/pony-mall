package com.ponymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ponymall.common.utils.PageUtils;
import com.ponymall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author hljuczh@163.com
 * @email hljuczh@163.com
 * @date 2022-04-07 15:04:47
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

