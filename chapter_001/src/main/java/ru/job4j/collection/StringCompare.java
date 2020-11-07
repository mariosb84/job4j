package ru.job4j.collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
          int j = Character.compare(left.charAt(i), right.charAt(i));
          if (j < 0 || (j == 0 && left.length() != right.length())) {
              rsl = -1;
              break;
          } else if (j > 0) {
              rsl = 1;
              break;
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
