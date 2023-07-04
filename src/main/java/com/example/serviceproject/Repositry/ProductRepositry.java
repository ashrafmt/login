package com.example.serviceproject.Repositry;

import com.example.serviceproject.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositry extends JpaRepository<Product, Integer> {
}
