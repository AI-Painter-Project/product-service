package org.aipainter.product.service.model.product;

import java.math.BigDecimal;

public interface IProduct {
    ProductType getProductType();
    BigDecimal getPrice();
}
