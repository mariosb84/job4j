package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String rus = "Неизвестное слово. ";
        return rus + eng;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        System.out.println(dummyDic.engToRus("english"));
    }
}
