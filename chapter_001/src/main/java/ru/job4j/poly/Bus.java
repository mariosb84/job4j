package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Start of motion");
    }

    @Override
    public void passengers(int num) {

    }

    @Override
    public int fill(int fuel) {
        int price = 48;
        return price * fuel;

    }

}
