package ru.job4j.oop;

public class Customer {
private int customerEstimate;
private int customerDate;
private int customerPrice;
Customer(int value) {
    this.customerEstimate = value;
}
    Customer(int value1, int value2) {
        this.customerDate = value1;
        this.customerPrice = value2;
    }
    public void showCustomerEstimate() {
        System.out.println("Смета от заказчика: " + this.customerEstimate);
    }
    public void showCustomerDate() {
        System.out.println("Срок от заказчика: " + this.customerDate);
    }
    public void showCustomerPrice() {
        System.out.println("Цена от заказчика: " + this.customerPrice);
    }
    public int getCustomerEstimate() {
        return this.customerEstimate;
    }
    public int getCustomerDate() {
        return this.customerDate;
    }
    public int getCustomerPrice() {
        return this.customerPrice;
    }


}
