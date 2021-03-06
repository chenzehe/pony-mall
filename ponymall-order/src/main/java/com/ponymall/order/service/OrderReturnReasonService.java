package com.ponymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ponymall.common.utils.PageUtils;
import com.ponymall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author hljuczh@163.com
 * @email hljuczh@163.com
 * @date 2022-04-08 10:12:18
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

