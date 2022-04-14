package com.ponymall.order;

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
public class PonyMallOrderApplication {

    /**
     * @Cacheable 触发将数据保存到缓存中的操作
     * @CacheEvict 触发将数据从缓存删除的操作
     * @CachePut
     * @Caching 组合以上多个操作
     * @CacheConfig
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(PonyMallOrderApplication.class, args);
    }

}
