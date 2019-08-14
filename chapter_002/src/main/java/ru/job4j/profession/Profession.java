package ru.job4j.profession;
public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;
    public Profession() {

    }
    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;

    }

    public String getSurname() {
        return this.surname;

    }

    public String getEducation() {
        return this.education;

    }
    public String getBirthday() {
        return this.birthday;

    }
    public String showInfo(String name1, String surname1, String education1, String birthday1) {
        this.name = name1;
        this.surname = surname1;
        this.education = education1;
        this.birthday = birthday1;
        return "People: " + name + " " + surname + ", " + education + ", " + birthday;
    }

}