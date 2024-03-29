package com.example.serviceproject.Service.imp;

import com.example.serviceproject.Dto.OrderDto;
import com.example.serviceproject.Entity.Order;
import com.example.serviceproject.Exception.ResourceNotFoundException;
import com.example.serviceproject.Repositry.OrderRepsitry;
import com.example.serviceproject.Service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImplement implements OrderService {
    private OrderRepsitry orderRepsitry;

    public OrderServiceImplement(OrderRepsitry orderRepsitry) {
        this.orderRepsitry = orderRepsitry;
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order = mapToEntity(orderDto);
        Order savedOrder = orderRepsitry.save(order);

        OrderDto orderResponse = mapToDto(savedOrder);
        return orderResponse;
    }

    @Override
    public List<OrderDto> getAllOrders() {
        List<Order> orders = orderRepsitry.findAll();
        return orders.stream().map(order -> mapToDto(order)).collect(Collectors.toList());
    }

    @Override
    public OrderDto getOrderById(int id) {
        Order order = orderRepsitry.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order","id", id));
        return mapToDto(order);
    }

    @Override
    public OrderDto updateOrder(OrderDto orderDto, int id) {
        Order order = orderRepsitry.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order","id", id));
        order.setId(orderDto.getId());
        order.setOrderedAt(orderDto.getOrderedAt());
        order.setCustomer(orderDto.getCustomer());
        order.setProductOrders(orderDto.getProductOrders());
        Order savedOrder = orderRepsitry.save(order);
        return mapToDto(savedOrder);
    }

    @Override
    public void deleteOrder(int id) {
        Order order = orderRepsitry.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order","id", id));
        orderRepsitry.delete(order);
    }

    // convert Doctor into DTO
    private OrderDto mapToDto(Order order) {
        OrderDto orderDto = new OrderDto();
        orderDto.setId(order.getId());
        orderDto.setOrderedAt(order.getOrderedAt());
        orderDto.setProductOrders(order.getProductOrders());
        orderDto.setCustomer(order.getCustomer());
        return orderDto;
    }

    // convert DTO to entity
    private Order mapToEntity(OrderDto orderDto) {
        Order order = new Order();
        order.setId(orderDto.getId());
        order.setOrderedAt(orderDto.getOrderedAt());
        order.setCustomer(orderDto.getCustomer());
        order.setProductOrders(orderDto.getProductOrders());
        return order;
    }
}
