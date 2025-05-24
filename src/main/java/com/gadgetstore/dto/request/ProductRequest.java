package com.gadgetstore.dto.request;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
    private String category;
    private int stockQuantity;
    private String imageUrl;
    private String brand;
    private String specifications;
}