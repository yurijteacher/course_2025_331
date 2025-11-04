package ua.com.kisit.unit10.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Category {

    private Long id;
    private String name;
    private String description;
    private String image;

    private List<Product> products;

}
