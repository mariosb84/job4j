package ru.job4j.poly;

public class TestTransport {
    public static void main(String[] args) {
        Vehicle vehicle = new Plane();
        Vehicle vehicle1 = new Traine();
        Vehicle vehicle2 = new NewBus();
Vehicle[] vehicles = new Vehicle[]{vehicle, vehicle1, vehicle2};
for (Vehicle vehicle3 : vehicles) {
    vehicle3.move();
}
    }
}
