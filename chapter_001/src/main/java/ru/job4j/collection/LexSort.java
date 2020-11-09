package ru.job4j.collection;

import java.util.Comparator;

import static java.lang.Integer.parseInt;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] wordsLeft = left.split("\\.");
        String[] wordsRight = right.split("\\.");
        left = wordsLeft[0];
        right = wordsRight[0];
        return Integer.compare(parseInt(left), parseInt(right));
    }
}
