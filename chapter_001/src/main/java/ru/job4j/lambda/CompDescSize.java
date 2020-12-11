package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompDescSize {
    public static void main(String[] args) {
        /*Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + Math.max(left.length(), right.length()) + " : " + Math.min(left.length(), right.length()));
            return Integer.compare(Math.min(left.length(), right.length()), Math.max(left.length(), right.length()));
        };*/
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            return Integer.compare(right.length(), left.length());
        };
        List<String> strings = Arrays.asList(
                "image 001",
                "image 0011",
                "image 00111"
        );
        strings.sort(cmpDescSize);
        System.out.println(strings);
    }


}


