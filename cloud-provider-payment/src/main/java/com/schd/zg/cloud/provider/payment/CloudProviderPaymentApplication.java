package com.schd.zg.cloud.provider.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhangguo
 * @date 2020/5/9 14:02
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.schd.zg.cloud.provider.payment.mapper")
public class CloudProviderPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPaymentApplication.class, args);
    }
}
