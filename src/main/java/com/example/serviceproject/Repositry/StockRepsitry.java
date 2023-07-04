package com.example.serviceproject.Repositry;

import com.example.serviceproject.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepsitry extends JpaRepository<Stock, Integer> {
}
