package com.example.serviceproject.Repositry;

import com.example.serviceproject.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepsitry extends JpaRepository<Order, Integer> {
}
