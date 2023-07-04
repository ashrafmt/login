package com.example.serviceproject.Service;

import com.example.serviceproject.Dto.ProductOrderDto;

import java.util.List;

public interface ProductOrderService {
    ProductOrderDto createProductOrder(ProductOrderDto ProductOrderDto);

    List<ProductOrderDto> getAllProductOrder();

    ProductOrderDto getProductOrderById(int id);

    ProductOrderDto updateProductOrder(ProductOrderDto ProductOrderDto,int id);

    void deleteProductOrder(int id);
}
