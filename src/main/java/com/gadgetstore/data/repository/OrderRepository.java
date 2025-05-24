package com.gadgetstore.data.repository;

import com.gadgetstore.data.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserAddress(String userAddress);
    List<Order> findByStatus(String status);
}