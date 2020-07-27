package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("tra tra tra");
    }
    public void song() {
        System.out.println("I believe I can fly");
    }
    public void music3() {
        music();
        music();
        music();
    }
    public void song3() {
        song();
        song();
        song();
    }
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music3();
        petya.song3();
    }
}
