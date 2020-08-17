package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int amount = 11;
        while (run) {
                System.out.println("Берите спичку(от 1 до 3)");
                System.out.println("Игрок 1: ");
                int select = Integer.valueOf(input.nextLine());
                amount -= select;
                System.out.println("Осталось " + amount + " спичек");
                if (amount < 1) {
                    run = false;
                    System.out.println("Игра окончена");
                    System.out.println("Выиграл 1 игрок");
                }
                System.out.println("Берите спичку(от 1 до 3)");
                System.out.println("Игрок 2: ");
                int selectTwo = Integer.valueOf(input.nextLine());
                amount -= selectTwo;
                System.out.println("Осталось " + amount + " спичек");
            if (amount < 1) {
                run = false;
                System.out.println("Игра окончена");
                System.out.println("Выиграл 2 игрок");
            }
            }



    }
}
