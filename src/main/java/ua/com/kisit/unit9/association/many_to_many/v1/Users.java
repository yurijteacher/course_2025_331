package ua.com.kisit.unit9.association.many_to_many.v1;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Users {

    private Long id;
    private String login;
    private String pass;

    private Set<Roles> roles = new HashSet<>();

}
