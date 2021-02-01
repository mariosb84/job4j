package ru.job4j.stream;


import java.util.Comparator;
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
                .map(p -> new Tuple(p.getName(), p.getSubjects().parallelStream()
                        .flatMap(s -> Stream.of(p.getSubjects()))
                        .flatMap(List::stream)
                        .mapToInt(Subject::getScore)
                        .average()
                        .orElse(0D)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {                           // не в ту сторону !!!
        return  stream
                .flatMap(s -> Stream.of(s.getSubjects()))
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Subject::getName,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(p -> new Tuple(p.getKey(), p.getValue()))
                .collect(Collectors.toList());

    }

    public static Tuple bestStudent(Stream<Pupil> stream) {                                            // без double!!!
        return  stream
                .map(p -> new Tuple(p.getName(), p.getSubjects().parallelStream()
                        .flatMap(s -> Stream.of(p.getSubjects()))
                        .flatMap(List::stream)
                        .mapToInt(Subject::getScore)
                        .sum()))
                .max(Comparator.comparing(Tuple::getScore))
        .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {                                           // работает
        return  stream
                .flatMap(s -> Stream.of(s.getSubjects()))
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(Subject::getName,
                        Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(p -> new Tuple(p.getKey(), p.getValue()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }


}
