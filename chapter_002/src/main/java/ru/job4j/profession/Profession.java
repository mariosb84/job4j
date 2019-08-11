package ru.job4j.profession;

public class Profession {
    public String name;
    public String surname;
    public String education;
    public String birthday;
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

}
