package ru.job4j.profession;

public class Engineer extends Profession {
    public String giveAssignment;
    public Engineer() {
    }
    public Engineer(String name, String surname, String giveAssignment) {
      this.giveAssignment = giveAssignment;
    }
    public void assignment(Worker worker) {
        System.out.println("Assigment to : " + worker + " is : " + giveAssignment);
    }

}
