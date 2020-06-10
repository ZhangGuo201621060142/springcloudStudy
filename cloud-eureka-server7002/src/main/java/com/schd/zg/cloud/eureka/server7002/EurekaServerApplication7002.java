package com.schd.zg.cloud.eureka.server7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhangguo
 * @date 2020/5/13 19:42
 * @description
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class EurekaServerApplication7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7002.class, args);
    }
}
