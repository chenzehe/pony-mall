package com.ponymall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 */
//@EnableRedisHttpSession
//@EnableFeignClients(basePackages = "com.yxj.gulimall.product.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class PonyMallProductApplication {

    /**
     * @Cacheable 触发将数据保存到缓存中的操作
     * @CacheEvict 触发将数据从缓存删除的操作
     * @CachePut
     * @Caching 组合以上多个操作
     * @CacheConfig
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(PonyMallProductApplication.class, args);
    }

}
