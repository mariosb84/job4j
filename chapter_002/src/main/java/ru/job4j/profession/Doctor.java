package ru.job4j.profession;

public class Doctor extends Profession {
    public String giveDiagnose;
    public Doctor() {
    }
    public Doctor(String name, String surname, String giveDiagnose) {
        this.giveDiagnose = giveDiagnose;
    }
    public void diagnoseHeal(Pacient pacient) {
        System.out.println("Doctor " + name + " " + surname + " " + " Give diagnose to pacient " + pacient +  " diagnose is : " + giveDiagnose);
    }
}
