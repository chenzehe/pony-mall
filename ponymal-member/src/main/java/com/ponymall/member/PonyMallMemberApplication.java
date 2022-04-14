package com.ponymall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author
 */
//@EnableRedisHttpSession
@EnableFeignClients(basePackages = "com.ponymall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class PonyMallMemberApplication {

    /**
     * @Cacheable 触发将数据保存到缓存中的操作
     * @CacheEvict 触发将数据从缓存删除的操作
     * @CachePut
     * @Caching 组合以上多个操作
     * @CacheConfig
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(PonyMallMemberApplication.class, args);
    }

}
