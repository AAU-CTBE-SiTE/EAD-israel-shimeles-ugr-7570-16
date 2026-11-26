package com.site.order_service.repo;

import com.site.order_service.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepo extends MongoRepository<Order, String> {
    List<Order> findByCustomerId(Long customerId);
}