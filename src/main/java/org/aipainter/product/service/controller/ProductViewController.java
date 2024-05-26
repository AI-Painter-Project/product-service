package org.aipainter.product.service.controller;

import org.aipainter.product.service.model.product.ProductType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/products/")
public class ProductViewController {
    @GetMapping
    public ResponseEntity<String> getProduct(@RequestParam String productType) {
        try {
            ProductType.valueOf(productType);
        } catch (IllegalArgumentException ex) {
            return new ResponseEntity<>("Product category is not recognized", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
