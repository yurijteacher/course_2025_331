package ua.com.kisit.unit10.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Category {

    private Long id;
    private String name;
    private String description;
    private String image;

    private List<Product> products;

}
