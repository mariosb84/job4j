package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start += el + "/";
            }
        }
        return new ArrayList<>(tmp);


    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp().reversed().thenComparing(new DepDescComp()));
}

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("K2/SK1/SSK2", "K2/SK1/SSK1",  "K1/SK1/SSK2", "K1/SK1/SSK1", "K2/SK1", "K1/SK1", "K1/SK2", "K2/SK2"));
        System.out.println("исходный список : ");
        System.out.println(list);
        System.out.println();
        List<String> list2 = fillGaps(list);
        System.out.println("Метод fill gaps : ");
        System.out.println(list2);
        System.out.println();
        System.out.println("Классическая сортировка : ");
        sortAsc(list2);
        System.out.println(list2);
        System.out.println();
        System.out.println("Обратная сортировка : ");
        sortDesc(list2);
        System.out.println(list2);

    }
}

