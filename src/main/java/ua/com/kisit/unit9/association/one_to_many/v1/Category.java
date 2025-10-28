package ua.com.kisit.unit9.association.one_to_many.v1;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Category {

    private Long id;
    private String description;
    private String name;
    private String image;

    private List<Product> productList;

}
