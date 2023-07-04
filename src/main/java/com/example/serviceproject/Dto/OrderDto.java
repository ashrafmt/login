package com.example.serviceproject.Dto;


import com.example.serviceproject.Entity.Customer;
import com.example.serviceproject.Entity.ProductOrder;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class OrderDto {

    private Long id;

    private Customer customer;

    private Date orderedAt;

    Set<ProductOrder> productOrders;
}
