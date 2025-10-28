package ua.com.kisit.lab4;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Students student = new Students();
        student.setId(1L);
        student.setFirstName("Vasya");
        student.setLastName("Pypkin");
        student.setEmail("va@ukr.net");
        student.setAddress("Address ...");
        student.setPhoneNumber(51323);
        student.setAge(23);

        Students student2 = new Students();
        student2.setId(2L);
        student2.setFirstName("Iva");
        student2.setLastName("Pypkina");
        student2.setEmail("v1@ukr.net");
        student2.setAddress("Address ...");
        student2.setPhoneNumber(52323);
        student2.setAge(21);

        Set<Students> students = new HashSet<>();
        students.add(student);
        students.add(student2);

        students
                .stream()
                .filter(el->el.getAge()<22)
                .forEach(el -> System.out.println(el));


        for (Students students1 : students) {
            System.out.println(students1);
        }

//        for (int i = 0; i < students.size(); i++) {
//            System.out.println(students);
//        }


    }

}
