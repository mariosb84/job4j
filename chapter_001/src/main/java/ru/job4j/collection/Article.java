package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String[] originText = origin.split("[\\p{IsPunctuation}\\p{IsWhite_Space}]+");
        String[] lineText = line.split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(originText));
        for (String string2 : lineText) {
            if (!check.contains(string2)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String str = "Мой дядя самых честных правил, "
                + "Когда не в шутку занемог, "
                + "Он уважать себя заставил "
                + "И лучше выдумать не мог. "
                + "Его пример другим наука; "
                + "Но, боже мой, какая скука "
                + "С больным сидеть и день и ночь, "
                + "Не отходя ни шагу прочь! "
                + "Какое низкое коварство "
                + "Полуживого забавлять, "
                + "Ему подушки поправлять, "
                + "Печально подносить лекарство, "
                + "Вздыхать и думать про себя: "
                + "Когда же черт возьмет тебя!";
        System.out.println(str);
        System.out.println();
        String[] originText = str.split("[\\p{IsPunctuation}\\p{IsWhite_Space}]+");
        System.out.println(Arrays.toString(originText));
    }
}
