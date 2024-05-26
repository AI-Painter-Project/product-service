package org.aipainter.product.service.model.product;

import lombok.NonNull;

public enum ProductType {
  FRAME("Frame to surround the picture"),
  MATERIAL("Material to print the picture on"),
  ADD_ON("Add-on for the printed picture frame");

  private final String description;

  ProductType(String description) {
    this.description = description;
  }

  public String getDescription(ProductType type) {
    return type.description;
  }
}
