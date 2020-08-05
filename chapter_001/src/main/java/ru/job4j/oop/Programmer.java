package ru.job4j.oop;

public class Programmer extends Engineer {
    private int dateWork;
    private int priceWork;
    public Programmer(int value, int value1) {
        this.dateWork = value;
        this.priceWork = value1;
    }
    public int calculateDate(Customer customer) {
        return this.dateWork + customer.getCustomerDate();
    }
    public int calculatePrice(Customer customer) {
        return this.priceWork + customer.getCustomerPrice();
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer(30, 100000);
        Customer customer = new Customer(15, 30000);
        System.out.println(programmer.calculatePrice(customer));
        customer.showCustomerPrice();
        System.out.println(programmer.calculateDate(customer));
        customer.showCustomerDate();
        System.out.println();
        programmer.setName("Иван2");
        programmer.setSurname("Иванов2");
        programmer.setEducation("Высшее");
        programmer.setBirthday("16.06.1989");
        programmer.setSalary("150000 руб.");
        programmer.setTechnicalSpecification("Разработка приложения");
        System.out.println(programmer.getName());
        System.out.println(programmer.getSurname());
        System.out.println(programmer.getEducation());
        System.out.println(programmer.getBirthday());
        System.out.println(programmer.getSalary());
        System.out.println(programmer.getTechnicalSpecification());
    }

}
