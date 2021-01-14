package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<Student2> levelOf(List<Student2> students, int bound) {
        return students.stream()
                .filter(Objects::nonNull)
                //.sorted((left, right) -> right.getSurname2().compareTo(left.getSurname2()))
                .sorted((left, right) -> Integer.compare(right.getScore2(), left.getScore2()))
                .takeWhile(st -> st.getScore2() > bound)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student2> input = new ArrayList<>();
        input.add(new Student2("Masha", 28));
        input.add(new Student2("Pety", 128));
        System.out.println(StudentLevel.levelOf(input, 20).get(0).getSurname2());
        System.out.println(StudentLevel.levelOf(input, 20).get(1).getSurname2());

    }

}
