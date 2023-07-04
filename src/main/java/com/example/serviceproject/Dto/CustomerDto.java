package com.example.serviceproject.Dto;

import com.example.serviceproject.Entity.Order;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CustomerDto {

    private Long id;

    private String firstName;

    private String lastName;

    private Date bornAt;

    private List<Order> orders;
}
