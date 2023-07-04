package com.example.serviceproject.Dto;

import com.example.serviceproject.Entity.Order;
import com.example.serviceproject.Entity.Product;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductOrderDto {
    private Long id;

    private Product product;

    private Order order;

    private Integer quantity;

    private BigDecimal price;

    private BigDecimal vat;
}
