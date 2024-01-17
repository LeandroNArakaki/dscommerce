package com.devsuperior.dscommerce.dtos;

import com.devsuperior.dscommerce.entities.Product;
import lombok.Getter;

@Getter
public class ProductMinDTO {

    private Long id;
    private String name;
    private Double price;
    private String imgUrl;


    public ProductMinDTO(Long id, String name, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductMinDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.imgUrl = product.getImgUrl();
    }


}
