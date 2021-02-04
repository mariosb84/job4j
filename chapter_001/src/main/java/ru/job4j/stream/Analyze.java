
package ru.job4j.stream;


import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {                                     // работает
        return stream
                .flatMap(s -> Stream.of(s.getSubjects()))
                .flatMap(List::stream)
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {                         //  работает
        return  stream
                .map(p -> new Tuple(p.getName(), p.getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore)
                        .average()
                        .orElse(0D)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {                           // работает
        return  stream
                .flatMap(s -> Stream.of(s.getSubjects()))
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(p -> new Tuple(p.getKey(), p.getValue()))
                .collect(Collectors.toList());

    }

    public static Tuple bestStudent(Stream<Pupil> stream) {                                            //  работает
        return  stream
                .map(p -> new Tuple(p.getName(), p.getSubjects()
                        .stream()
                        .mapToDouble(Subject::getScore)
                        .sum()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {                                           // работает
        return  stream
                .flatMap(s -> Stream.of(s.getSubjects()))
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new,
                        Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(p -> new Tuple(p.getKey(), p.getValue()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }

    public static void main(String[] args) {
        List list = List.of(
                new Pupil("Ivanov", List.of(new Subject("Math", 100), new Subject("Lang", 100))),
                new Pupil("Petrov", List.of(new Subject("Math", 60), new Subject("Lang", 60)))
        );
        Tuple tuple = bestStudent(list.stream());
        System.out.println(tuple.getName());
        System.out.println(tuple.getScore());
        System.out.println();
        List list1 = List.of(
                new Pupil("Ivanov", List.of(new Subject("Math", 100), new Subject("Lang", 40))),
                new Pupil("Petrov", List.of(new Subject("Math", 60), new Subject("Lang", 60)))
        );
        Tuple tuple1 = bestSubject(list1.stream());
        System.out.println(tuple1.getName());
        System.out.println(tuple1.getScore());
    }

}



