package ua.com.kisit.lab4;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Students {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private String address;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Students students)) return false;
        return getPhoneNumber() == students.getPhoneNumber() && getAge() == students.getAge() && Objects.equals(getFirstName(), students.getFirstName()) && Objects.equals(getLastName(), students.getLastName()) && Objects.equals(getEmail(), students.getEmail()) && Objects.equals(getAddress(), students.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getEmail(), getPhoneNumber(), getAddress(), getAge());
    }
}
