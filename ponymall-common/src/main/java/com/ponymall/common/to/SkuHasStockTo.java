package com.ponymall.common.to;

import lombok.Data;

/**
 *
 * @author yaoxinjia
 */
@Data
public class SkuHasStockTo {
    private Long skuId;
    private Boolean hasStock;
}
