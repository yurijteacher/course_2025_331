package ua.com.kisit.unit10.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String username;
    private String phone;
    private String address;

    private List<Order> orders;
}
