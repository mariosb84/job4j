package ru.job4j.oop;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0, change = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (change - coins[i] >= 0) {
                rsl[size] = coins[i];
                change -= coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
    public static void main(String[] args) {
        Machine machine = new Machine();
        System.out.println(Arrays.toString(machine.change(100, 1)));
    }
}