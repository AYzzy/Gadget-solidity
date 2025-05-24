package com.gadgetstore.data.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String userAddress;
    private LocalDateTime orderDate;
    private BigDecimal totalAmount;
    private String transactionHash;
    private String status;
    private String shippingAddress;
    private String paymentMethod;
}