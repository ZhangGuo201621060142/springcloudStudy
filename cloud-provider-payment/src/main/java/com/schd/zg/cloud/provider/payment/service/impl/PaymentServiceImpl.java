package com.schd.zg.cloud.provider.payment.service.impl;

import com.schd.zg.cloud.provider.payment.entity.Payment;
import com.schd.zg.cloud.provider.payment.mapper.PaymentMapper;
import com.schd.zg.cloud.provider.payment.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-05-09
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

}
