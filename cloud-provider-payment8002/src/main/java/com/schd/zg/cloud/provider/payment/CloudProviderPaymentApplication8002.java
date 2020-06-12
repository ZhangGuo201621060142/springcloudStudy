package com.schd.zg.cloud.provider.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhangguo
 * @date 2020/5/9 14:02
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.schd.zg.cloud.provider.payment.mapper")
public class CloudProviderPaymentApplication8002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPaymentApplication8002.class, args);
    }
}
