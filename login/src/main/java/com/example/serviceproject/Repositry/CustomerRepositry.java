package com.example.serviceproject.Repositry;

import com.example.serviceproject.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositry extends JpaRepository<Customer, Integer> {

}
