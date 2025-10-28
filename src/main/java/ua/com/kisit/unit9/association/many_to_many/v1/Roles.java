package ua.com.kisit.unit9.association.many_to_many.v1;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Roles {

    private Long id;
    private String name;

    private Set<Users> users = new HashSet<>();
}
