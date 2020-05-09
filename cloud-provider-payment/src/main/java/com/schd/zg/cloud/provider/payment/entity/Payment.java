package com.schd.zg.cloud.provider.payment.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-05-09
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
public class Payment {

    private static final long serialVersionUID = 1L;

    private String serial;


}
