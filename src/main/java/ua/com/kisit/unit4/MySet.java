package ua.com.kisit.unit4;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);

        User user1 = new User();
        user1.setId(1L);
        user1.setFirstName("Vasya");
        user1.setLastName("Pypkin");
        user1.setAge(30);

        // v.2

        User user2 = new User(2L, "Iva","Pypkina", 18);
        User user3 = new User(3L, "Ivanka","Pypkina", 20);
        User user4 = new User(4L, "Ivanka","Pypkina", 20);

        Set<User> set2 = new HashSet<>();
        set2.add(user1);
        set2.add(user2);
        set2.add(user3);
        set2.add(user1);
        set2.add(user4);

        System.out.println(set2);

    }


}
