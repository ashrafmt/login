package com.example.serviceproject.Dto;

import com.example.serviceproject.Entity.Product;
import lombok.Data;

import java.util.Date;

@Data
public class StockDto {
    private Long id;

    private Product product;

    private Integer quantity;

    private Date updateAt;
}
