package com.gadgetstore.dto.request;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class OrderRequest {
    private String userAddress;
    private BigDecimal totalAmount;
    private String shippingAddress;
    private String paymentMethod;
}