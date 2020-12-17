package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
       /* ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (predict.test(student)) {
                result.add(student);
            }
        }
        return result;
    }*/
        List<Student> result = students.stream().filter(
                predict
        ).collect(Collectors.toList());
       // result.forEach(System.out::println);
       //return result;

}

