package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Matches matches = new Matches();
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int amount = 11;
        int count = 0;
        while (run) {
            matches.showEight();
            if (count % 2 == 0) {
                matches.showSix();
            } else {
                matches.showSeven();
            }
            int select = Integer.valueOf(input.nextLine());
            boolean validation = select <= 3 && select >= 1;
            if (validation) {
                amount -= select;
                matches.showFour(amount);
                count++;
            } else {
                matches.showFive();
                continue;
            }
            if (amount < 1) {
                run = false;
                matches.showThree();
                if (count % 2 == 0) {
                    matches.showTwo();
                } else {
                    matches.showOne();
                }
            }
        }
    }
    public void showOne() {
        System.out.println("Выиграл 1 игрок");
    }
    public void showTwo() {
        System.out.println("Выиграл 2 игрок");
    }
    public void showThree() {
        System.out.println("Игра окончена");
    }
    public void showFour(int amount) {
        System.out.println("Осталось спичек : " + amount);
    }
    public void showFive() {
        System.out.println("Можно взять от 1 до 3 спичек !!!");
    }
    public void showSix() {
        System.out.println("Игрок 1: ");
    }
    public void showSeven() {
        System.out.println("Игрок 2: ");
    }
    public void showEight() {
        System.out.println("Возьмите  спичку(от 1 до 3)");
    }

}
