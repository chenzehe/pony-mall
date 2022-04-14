package com.ponymall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class PonyMallGatewayApplication {

    /**
     * @Cacheable 触发将数据保存到缓存中的操作
     * @CacheEvict 触发将数据从缓存删除的操作
     * @CachePut
     * @Caching 组合以上多个操作
     * @CacheConfig
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(PonyMallGatewayApplication.class, args);
    }

}
