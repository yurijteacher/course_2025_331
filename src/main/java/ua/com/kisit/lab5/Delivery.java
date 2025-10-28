package ua.com.kisit.lab5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Delivery {

    private Long id;
    private String name;
    private String description;

    public Delivery(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
