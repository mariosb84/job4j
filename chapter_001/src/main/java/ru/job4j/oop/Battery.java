package ru.job4j.oop;

public class Battery {
    private int load;
    public Battery(int size) {
        this.load = size;
    }
    public void exchange(Battery another) {
            another.load += this.load;
            this.load -= this.load;
            System.out.println(this.load);
    }
    public static void main(String[] args) {
        Battery batteryOne = new Battery(100);
        Battery batterySecond = new Battery(0);
        System.out.println("Размер первой батареи : " + batteryOne.load);
        System.out.println("Размер второй батареи : " + batterySecond.load);
        batteryOne.exchange(batterySecond);
        System.out.println("Размер первой батареи : " + batteryOne.load);
        System.out.println("Размер второй батареи : " + batterySecond.load);
    }
}