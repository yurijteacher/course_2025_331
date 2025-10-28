package ua.com.kisit.unit9.association.many_to_many.v2;

import lombok.*;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@ToString

public class RolesHasUsers {

    private Long id;
    private Roles role;
    private Users user;

}
