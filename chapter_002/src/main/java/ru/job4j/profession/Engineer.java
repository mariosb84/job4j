package ru.job4j.profession;
public class Engineer extends Profession {
    private String giveProject;
    public Engineer() {
    }
    public void  setGiveProject(String giveProject1) {
        this.giveProject = giveProject1;
    }
    public String project(Customer customer) {
        return customer + " give  project : " + giveProject;
    }

}
