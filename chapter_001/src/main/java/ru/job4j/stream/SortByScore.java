package ru.job4j.stream;

import java.util.Comparator;

public class SortByScore implements Comparator<Student2> {
        @Override
        public int compare(Student2 first, Student2 second) {
            return Integer.compare(second.getScore2(), first.getScore2());
        }
}
