package ua.com.kisit.unit4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyList {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(list);

        //list.add(11);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        System.out.println(list2);

        list2.add(1, 5);

        System.out.println(list2);

        list2.remove(4);
        System.out.println(list2);

        list2.clear();
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);

        List<Integer> list4 = new ArrayList<>(list3);
        list4.add(1);
        list4.add(2);
        list4.add(3);

        System.out.println(list4);

        // v.1
        User user1 = new User();
        user1.setId(1L);
        user1.setFirstName("Vasya");
        user1.setLastName("Pypkin");
        user1.setAge(30);

        // v.2

        User user2 = new User(2L, "Iva","Pypkina", 18);
        User user3 = new User(3L, "Ivanka","Pypkina", 20);

        // group student
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println(userList);

        User userById1 = userList.get(1);
        System.out.println(userById1);

        List<User> userSorted = userList
                                        .stream()
                                        .sorted(Comparator.comparing(User::getAge))
                                        .toList();

        System.out.println(userSorted);

        userSorted.forEach(System.out::println);

        userSorted
                .stream()
                .min(Comparator
                        .comparing(User::getAge))
                .ifPresent(System.out::println);

        userSorted.stream().max(Comparator.comparing(User::getAge)).ifPresent(System.out::println);

        // послідовні потоки
        userSorted
                .stream()
                .map(e->"Hello, " + e.getFirstName() + " " + e.getLastName() +"!")
                .forEach(System.out::println);

        userList.add(user3);
        System.out.println(userList);

        userSorted.parallelStream().forEach(System.out::println);

        // паралельні потоки
        userSorted
                .parallelStream()
                .map(e->"Hello, " + e.getFirstName() + " " + e.getLastName())
                .forEach(System.out::println);

    }


}
