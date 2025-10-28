package ua.com.kisit.lab5;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Orders {

    private Long id;
    private Date dateCreated;
    private Payment payment;
    private Delivery delivery;
    private Customers customer;

}
