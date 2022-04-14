package com.ponymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ponymall.common.utils.PageUtils;
import com.ponymall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author hljuczh@163.com
 * @email hljuczh@163.com
 * @date 2022-04-08 10:48:42
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

