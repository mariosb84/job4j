package ru.job4j.profession;
public class Customer {
    private String nameCustomer;
    private  String surnameCustomer;
    public Customer(String nameCustomer1, String surnameCustomer1) {
        this.nameCustomer = nameCustomer1;
        this.surnameCustomer = surnameCustomer1;
    }
    @Override
    public String toString() {
        return this.nameCustomer + " " + this.surnameCustomer;
    }
}
