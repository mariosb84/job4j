package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SchoolMap {
    public Map<String, Student> collectMap(List<Student> students) {
        return  students
                .stream()
                .distinct()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        student ->  students.get(students.indexOf(student))
                        )
                );



    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "Surname1"));
        students.add(new Student(20, "Surname2"));
        students.add(new Student(30, "Surname3"));
        SchoolMap sc = new SchoolMap();
        Map<String, Student> rsl = sc.collectMap(students);
        System.out.println(rsl.get("Surname1").getScore());
        System.out.println(rsl.get("Surname2").getScore());
        System.out.println(rsl.get("Surname3").getScore());
    }
}
