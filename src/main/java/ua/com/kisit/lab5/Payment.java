package ua.com.kisit.lab5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.com.kisit.unit9.association.one_to_one.v1.Customer;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Payment {

    private Long id;
    private String name;

}
