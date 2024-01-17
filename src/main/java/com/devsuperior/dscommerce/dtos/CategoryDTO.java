package com.devsuperior.dscommerce.dtos;

import com.devsuperior.dscommerce.entities.Category;
import lombok.Getter;

@Getter
public class CategoryDTO {

    private Long id;
    private String name;


    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }


}
