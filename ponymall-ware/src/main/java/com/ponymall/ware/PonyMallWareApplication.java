package com.ponymall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author
 */
//@EnableRedisHttpSession
//@EnableFeignClients(basePackages = "com.yxj.gulimall.product.feign")
//@EnableDiscoveryClient
//@MapperScan("com.ponymall.product.dao")
@SpringBootApplication
public class PonyMallWareApplication {

    /**
     * @Cacheable 触发将数据保存到缓存中的操作
     * @CacheEvict 触发将数据从缓存删除的操作
     * @CachePut
     * @Caching 组合以上多个操作
     * @CacheConfig
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(PonyMallWareApplication.class, args);
    }

}
