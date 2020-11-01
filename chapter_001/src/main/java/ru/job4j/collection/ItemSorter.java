package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(3, "f"),
                new Item(2, "e"),
                new Item(1, "d")
        );
        System.out.println("первоначально:");
        System.out.println(items);
        System.out.println("прямая сортировка:");
        Collections.sort(items);
        System.out.println(items);
        System.out.println("обратная сортировка:");
        Collections.sort(items, Collections.reverseOrder());
        System.out.println(items);
        System.out.println("прямая сортировка по имени:");
        Collections.sort(items, new SortByNameItem());
        System.out.println(items);
        System.out.println("обратная  сортировка по имени:");
        Collections.sort(items, new SortByNameItem().reversed());
        System.out.println(items);
    }
}
