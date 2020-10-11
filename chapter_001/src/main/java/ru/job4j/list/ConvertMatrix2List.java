package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
        list.add(cell);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] rsl = new int[][] {{1, 2, 3, 4, 5, 6, 7}, {8, 9, 10, 11, 12, 13, 14}};
        ConvertMatrix2List convertMatrix2List = new ConvertMatrix2List();
        System.out.println(convertMatrix2List.toList(rsl));
    }
}
