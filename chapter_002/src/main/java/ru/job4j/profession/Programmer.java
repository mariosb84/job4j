package ru.job4j.profession;
public class Programmer extends  Engineer {

    private String writeCode;
    public void  setCodeSubjects(String writeCode1) {
        this.writeCode = writeCode1;
    }
    public String codeSubjects(Customer customer) {
        return customer + " ordered the code subjects : " + writeCode;
    }

}
