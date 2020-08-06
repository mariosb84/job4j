package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Иван");
        student.setSurname("Иванов");
        student.setGroupNumber(312);
        student.setDateOfReceipt(new Date());
        System.out.println("Студент : " + student.getName() + " " + student.getSurname() + ", "
                + "№ группы : " + student.getGroupNumber() + ", " + "дата поступления : "
                + student.getDateOfReceipt());
    }
}
