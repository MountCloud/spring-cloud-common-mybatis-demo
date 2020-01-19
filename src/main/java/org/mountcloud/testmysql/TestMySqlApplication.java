package org.mountcloud.testmysql;

import org.mountcloud.springcloud.common.mybatis.EnableMyBatis;
import org.mountcloud.testmysql.config.EnableTestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhanghaishan
 * @version V1.0
 * TODO:
 * 2020/1/17.kk
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages={"org.mountcloud.testmysql","org.mountcloud.springcloud"})
@EnableMyBatis
public class TestMySqlApplication  {

    public static void main(String[] args) {
        SpringApplication.run(TestMySqlApplication.class, args);
    }
}
