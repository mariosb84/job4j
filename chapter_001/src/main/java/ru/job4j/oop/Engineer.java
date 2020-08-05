package ru.job4j.oop;

public class Engineer extends Profession {
private String salary;
private String technicalSpecification;

    public String getSalary() {
        return this.salary;
    }
    public String getTechnicalSpecification() {
        return this.technicalSpecification;
    }
    public void setSalary(String salary) {
         this.salary = salary;
    }
    public void setTechnicalSpecification(String technicalSpecification) {
        this.technicalSpecification = technicalSpecification;
    }
}
