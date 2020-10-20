package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        /* for-each origin -> new HashSet. */
        HashSet<String> check = new HashSet<>(Arrays.asList(origin));
        /* for-each text -> hashSet.contains */
        for (String string2 : text) {
            if (!check.contains(string2)) {
                rsl = false;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String str = "123 456 789";
        String str2 = "123 789 456";
        System.out.println(UniqueText.isEquals(str, str2));
    }
}
