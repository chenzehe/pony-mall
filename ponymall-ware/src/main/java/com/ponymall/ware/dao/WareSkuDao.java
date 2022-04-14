package com.ponymall.ware.dao;

import com.ponymall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author hljuczh@163.com
 * @email hljuczh@163.com
 * @date 2022-04-08 10:48:42
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
