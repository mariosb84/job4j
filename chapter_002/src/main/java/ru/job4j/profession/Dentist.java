package ru.job4j.profession;
public class Dentist extends Doctor {
    private int removeTooth;
    public void setNumberOfTooth(int removeTooth1) {
        this.removeTooth = removeTooth1;
    }
    public String treatTooth(Pacient pacient) {
        return pacient + " remove tootth number of : " + removeTooth;
    }
}