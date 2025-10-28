package ua.com.kisit.unit9.association.many_to_many.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Users {

    private Long id;
    private String username;
    private String password;

}
