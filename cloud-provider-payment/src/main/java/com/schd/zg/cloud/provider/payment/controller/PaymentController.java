package com.schd.zg.cloud.provider.payment.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.schd.zg.cloud.api.commons.entities.Payment;
import com.schd.zg.cloud.api.commons.response.CommonResult;
import com.schd.zg.cloud.provider.payment.service.IPaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Wrapper;

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

    @PostMapping("/add")
    public CommonResult<Payment> add(@RequestBody Payment payment) {
        CommonResult<Payment> commonResult = new CommonResult<>();
        boolean flag = paymentService.save(payment);
        if (flag) {
            commonResult.setCode(200);
            commonResult.setMessage("插入成功！");
            commonResult.setData(payment);
        } else {
            commonResult.setCode(500);
            commonResult.setMessage("插入失败！");
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
            commonResult.setMessage("查询数据失败！");
        } else {
            commonResult.setCode(200);
            commonResult.setMessage("查询数据成功！");
            commonResult.setData(payment);
        }
        return commonResult;
    }

}
