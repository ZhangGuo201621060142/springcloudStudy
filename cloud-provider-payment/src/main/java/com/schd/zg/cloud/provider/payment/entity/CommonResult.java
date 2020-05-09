package com.schd.zg.cloud.provider.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangguo
 * @date 2020/5/9 17:41
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 404 not found
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
