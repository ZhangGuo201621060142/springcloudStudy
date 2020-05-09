package com.schd.zg.cloud.provider.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangguo
 * @date 2020/5/9 14:02
 * @description
 */
@SpringBootApplication
@MapperScan("com.schd.zg.cloud.provider.payment.mapper")
public class CloudProviderPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPaymentApplication.class, args);
    }
}
