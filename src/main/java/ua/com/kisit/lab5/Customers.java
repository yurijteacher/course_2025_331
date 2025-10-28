package ua.com.kisit.lab5;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Customers {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private List<Address> address;
    private List<Orders> orders;

    private Users user;

}
