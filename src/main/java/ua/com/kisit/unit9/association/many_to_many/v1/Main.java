package ua.com.kisit.unit9.association.many_to_many.v1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Roles role1 = new Roles();
        role1.setId(1L);
        role1.setName("admin");

        Roles role2 = new Roles();
        role2.setId(2L);
        role2.setName("manager");

        Roles role3 = new Roles();
        role3.setId(3L);
        role3.setName("user");

        Users user = new Users();

        user.setId(1L);
        user.setLogin("Vasya");
        user.setPass("1234");

        Set<Roles> roles = new HashSet<>();
        roles.add(role1);
        roles.add(role2);
        roles.add(role3);

        user.setRoles(roles);

        System.out.println(user);


    }

}
