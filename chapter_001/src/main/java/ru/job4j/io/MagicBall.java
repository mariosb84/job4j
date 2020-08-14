package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String questionUser = input.nextLine();
        String answer;
        int answerRand = new Random().nextInt(3);
        if (answerRand == 0) {
            answer = "Да";
        } else if (answerRand == 1) {
            answer = "нет";
        } else {
            answer = "Не знаю";
        }
        System.out.println(" Ты хочешь узнать " + questionUser +  " ?" +  " - " + answer);
    }
}
