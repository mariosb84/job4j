package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Matches matches = new Matches();
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int amount = 11;
        int countOne = 0;
        int countTwo = 0;
        while (run) {
            System.out.println("Берите спичку(от 1 до 3)");
            System.out.println("Игрок 1: ");
            int select = Integer.valueOf(input.nextLine());
            Boolean validationOne = select <= 3 && select >= 1;
            if (validationOne) {
                amount -= select;
                matches.showFour(amount);
                countOne++;
            } else {
                matches.showFive();
                continue;
            }
            System.out.println("Игрок 2: ");
            int selectTwo = Integer.valueOf(input.nextLine());
            Boolean validationTwo = selectTwo <= 3 && selectTwo >= 1;
            if (validationTwo) {
                amount -= selectTwo;
                matches.showFour(amount);
                countTwo++;
            } else {
                matches.showFive();
                continue;
            }
            if (amount < 1) {
                run = false;
                matches.showThree();
                if (countOne > countTwo) {
                    matches.showOne();
                } else {
                    matches.showTwo();
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

}
