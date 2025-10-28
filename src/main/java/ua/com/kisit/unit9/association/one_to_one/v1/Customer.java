package ua.com.kisit.unit9.association.one_to_one.v1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private User user;

}
