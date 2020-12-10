package ru.job4j.lambda;

import java.util.Comparator;

public class CompDescSize {
    Comparator<String> cmpDescSize = (left, right) -> {
        System.out.println("compare - " + Math.max(left.length(), right.length()) + " : " + Math.min(left.length(), right.length()));
        return Integer.compare(Math.max(left.length(), right.length()), Math.min(left.length(), right.length()));
    };
}

