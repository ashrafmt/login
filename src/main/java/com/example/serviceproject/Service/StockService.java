package com.example.serviceproject.Service;

import com.example.serviceproject.Dto.StockDto;

import java.util.List;

public interface StockService {
    StockDto createProduct(StockDto stockDto);

    List<StockDto> getAllProducts();

    StockDto getProductById(int id);

    StockDto updateProduct(StockDto stockDto, int id);

    void deleteProduct(int id);
}
