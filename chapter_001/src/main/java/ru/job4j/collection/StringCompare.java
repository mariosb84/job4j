package ru.job4j.collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                break;
            } else {
               rsl = Integer.compare(left.length(), right.length());
            }
        }
            return rsl;

    }

    public static void main(String[] args) {
        String left = "Petrov";
        String right = "Ivanova";
        System.out.println(left.compareTo(right));
        System.out.println();
        StringCompare stringCompare = new StringCompare();
        System.out.println(stringCompare.compare(left, right));
    }
}
