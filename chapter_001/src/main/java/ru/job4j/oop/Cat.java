package ru.job4j.oop;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

public class Cat {

    private String food;
    private String name;
    public void showFood() {
        System.out.println(this.food);
    }
    public void showName() {
        System.out.println(this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat black = new Cat();
        gav.giveNick("Tom");
        System.out.print("The cat name is : ");
        gav.showName();
        System.out.print("The cat food is : ");
        gav.eat("Корм");
        gav.showFood();
        black.giveNick("Martin");
        System.out.print("The cat name is : ");
        black.showName();
        System.out.print("The cat food is : ");
        black.eat("Рыба");
        black.showFood();

    }
}