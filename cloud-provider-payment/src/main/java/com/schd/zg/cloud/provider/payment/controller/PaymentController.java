package com.schd.zg.cloud.provider.payment.controller;


import com.schd.zg.cloud.api.commons.entities.Payment;
import com.schd.zg.cloud.api.commons.response.CommonResult;
import com.schd.zg.cloud.provider.payment.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-05-09
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Resource
    private IPaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/add")
    public CommonResult<Payment> add(@RequestBody Payment payment) {
        CommonResult<Payment> commonResult = new CommonResult<>();
        boolean flag = paymentService.saveOrUpdate(payment);
        if (flag) {
            commonResult.setCode(200);
            commonResult.setMessage("插入成功！port：" + port);
            commonResult.setData(payment);
        } else {
            commonResult.setCode(500);
            commonResult.setMessage("插入失败！port：" + port);
            commonResult.setData(payment);
        }
        return commonResult;
    }

    @GetMapping("/get")
    public CommonResult<Payment> get(@RequestParam("id") long id) {
        CommonResult<Payment> commonResult = new CommonResult<>();
        Payment payment = paymentService.getById(id);
        if (payment == null) {
            commonResult.setCode(500);
            commonResult.setMessage("查询数据失败！port：" + port);
        } else {
            commonResult.setCode(200);
            commonResult.setMessage("查询数据成功！port：" + port);
            commonResult.setData(payment);
        }
        return commonResult;
    }

    @GetMapping("/discovery")
    public CommonResult discovery() {
        for (String service : discoveryClient.getServices()) {
            log.info(service);
            for (ServiceInstance instance : discoveryClient.getInstances(service)) {
                log.info(instance.getServiceId() + " " + instance.getHost() + " " + instance.getUri());
            }
        }
        return new CommonResult();
    }

}
