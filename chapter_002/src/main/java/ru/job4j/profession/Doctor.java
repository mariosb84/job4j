package ru.job4j.profession;
public class Doctor extends Profession {
    private String giveDiagnose;
    public Doctor() {
    }
    public void  setGiveDiagnose(String giveDiagnose1) {
        this.giveDiagnose = giveDiagnose1;
    }
    public String diagnoseHeal(Pacient pacient) {
        return pacient + " diagnose is : " + giveDiagnose;
    }
}