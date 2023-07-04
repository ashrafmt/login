package com.example.serviceproject.Repositry;

import com.example.serviceproject.Entity.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepositry extends JpaRepository<ProductOrder, Integer>{

}
