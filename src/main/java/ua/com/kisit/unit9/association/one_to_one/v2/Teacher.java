package ua.com.kisit.unit9.association.one_to_one.v2;

import lombok.*;

@Setter
@Generated
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Teacher {

    private String firstName;
    private String lastName;

    private int age;

    private Student student;

}
