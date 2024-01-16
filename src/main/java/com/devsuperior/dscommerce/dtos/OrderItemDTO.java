package com.devsuperior.dscommerce.dtos;

import com.devsuperior.dscommerce.entities.OrderItem;
import lombok.Getter;

@Getter
public class OrderItemDTO {

    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;

    public OrderItemDTO(Long productId, String name, Double price, Integer quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderItemDTO(OrderItem entity) {
        productId = entity.getProduct().getId();
        name = entity.getProduct().getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
    }


    public Double subTotal(){
        return price * quantity;
    }
}