package ru.job4j.profession;
public class Surgeon extends Doctor {
    private String operation;
    public void setNameOperation(String operation1) {
        this.operation = operation1;
    }
    public String toOperate(Pacient pacient) {
        return pacient + " operation performed : " + operation;
    }
}
