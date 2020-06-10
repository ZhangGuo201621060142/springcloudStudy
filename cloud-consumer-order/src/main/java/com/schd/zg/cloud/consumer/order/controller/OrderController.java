package com.schd.zg.cloud.consumer.order.controller;

import com.schd.zg.cloud.api.commons.entities.Payment;
import com.schd.zg.cloud.api.commons.response.CommonResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhangguo
 * @date 2020/5/11 17:11
 * @description
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public CommonResult add(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/add", payment, CommonResult.class);
    }

    @GetMapping("/get")
    public CommonResult get(@RequestParam("id") long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get?id=" + id, CommonResult.class);
    }

}
