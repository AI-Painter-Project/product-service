package org.aipainter.product.service.model.product;

import java.math.BigDecimal;

public class Frame implements IProduct {

    @Override
    public ProductType getProductType() {
        return ProductType.FRAME;
    }

    @Override
    public BigDecimal getPrice() {
    return new BigDecimal(0);
    }
}