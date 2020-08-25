package ru.job4j.oop;

public class College {
    StudentTwo st = new StudentTwo();
    Freshman fr = new Freshman();
    Object ob = new Object();
    StudentTwo stTwo = fr; // upcasting
    Object obTwo = fr; // upcasting
    Freshman frTwo = (Freshman) ob; // downcasting
}
