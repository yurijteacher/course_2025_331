package ua.com.kisit.unit9.association.one_to_one.v1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.com.kisit.unit9.association.one_to_one.v2.Student;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private Student username;
    private Student password;


}
