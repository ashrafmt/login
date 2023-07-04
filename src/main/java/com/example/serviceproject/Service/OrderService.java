package com.example.serviceproject.Service;

import com.example.serviceproject.Dto.OrderDto;

import java.util.List;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDto);

    List<OrderDto> getAllOrders();

    OrderDto getOrderById(int id);

    OrderDto updateOrder(OrderDto orderDto,int id);

    void deleteOrder(int id);
}
