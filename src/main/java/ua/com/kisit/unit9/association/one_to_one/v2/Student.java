package ua.com.kisit.unit9.association.one_to_one.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    private Teacher teacher;

//    public Student() {
//    }
//
//    public Student(Teacher teacher) {
//        this.teacher = teacher;
//    }
//
//    public Teacher getTeacher() {
//        return teacher;
//    }
//
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }
}
