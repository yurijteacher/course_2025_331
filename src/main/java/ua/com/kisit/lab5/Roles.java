package ua.com.kisit.lab5;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Roles {

    private Long id;
    private String name; // Admin, Manager, User

    private Set<Users> user = new HashSet<>();

    public Roles(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
