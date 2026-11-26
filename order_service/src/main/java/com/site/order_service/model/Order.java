package com.site.order_service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
@Data
public class Order {

    @Id
    private String id;

    private Long customerId;
    private String product;
    private Integer quantity;
    private Double price;
}