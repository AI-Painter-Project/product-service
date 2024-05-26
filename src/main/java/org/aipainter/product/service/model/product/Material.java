package org.aipainter.product.service.model.product;

import lombok.Getter;
import lombok.NonNull;

import java.math.BigDecimal;
@Getter
public class Material implements IProduct {
    private final MaterialType materialType;
    private final BigDecimal price;

    public Material(@NonNull final MaterialType materialType, @NonNull final BigDecimal price) {
        this.materialType = materialType;
        this.price = price;
    }
    @Override
    public ProductType getProductType() {
        return ProductType.MATERIAL;
    }
}
