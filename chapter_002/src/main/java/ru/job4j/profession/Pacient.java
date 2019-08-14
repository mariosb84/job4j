package ru.job4j.profession;
public class Pacient {
    private String namePacient;
    private  String surnamePacient;
    public Pacient(String namePacient1, String surnamePacient1) {
        this.namePacient = namePacient1;
        this.surnamePacient = surnamePacient1;
    }
    @Override
    public String toString() {
        return this.namePacient + " " + this.surnamePacient;
    }
}
