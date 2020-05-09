package com.schd.zg.cloud.provider.payment.controller;


import com.schd.zg.cloud.provider.payment.entity.CommonResult;
import com.schd.zg.cloud.provider.payment.service.IPaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class PaymentController {

    @Resource
    private IPaymentService paymentService;

    @GetMapping("/get")
    public CommonResult get() {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(200);
        commonResult.setData("哈啊啊啊啊啊啊啊!76857!!");
        return commonResult;
    }

}
