package com.ponymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ponymall.common.utils.PageUtils;
import com.ponymall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author hljuczh@163.com
 * @email hljuczh@163.com
 * @date 2022-04-08 10:23:18
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

