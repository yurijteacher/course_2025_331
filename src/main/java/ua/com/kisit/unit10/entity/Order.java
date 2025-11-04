package ua.com.kisit.unit10.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Order {

    private Long id;
    private boolean status;
    private Date dateCreated;
    private String delivery;
    private String payment;

    private Customer customer;



}
