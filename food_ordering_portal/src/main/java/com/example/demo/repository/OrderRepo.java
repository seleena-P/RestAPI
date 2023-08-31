package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {
 @Query(value="select * from neworder where date=:d",nativeQuery=true)
 public List<Order> getbydate(@Param("d") int date);
}
