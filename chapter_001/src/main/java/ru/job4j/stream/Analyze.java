package ru.job4j.stream;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {                                     // работает
        return  stream
                .flatMap(s -> Stream.of(s.getSubjects()))
                .flatMap(List::stream)
                        .mapToInt(Subject::getScore)
                        .average()
                        .orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {                         // не работает !!!
        return  stream
                .flatMap(s -> Stream.of(s.getSubjects()))
                .flatMap(List::stream)
                .map(s -> new Tuple(s.getName(), s.getScore()))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {                           // не работает !!!
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

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return null;
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }


    public static void main(String[] args) {
        var x = 0;
        var y = 5;
        var z = 7;
        int f = 0;
    }
}
