package ru.job4j.oop;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport jsonReport = new JSONReport();
        String textTwo = jsonReport.generate("name2", "body2");
        System.out.println(textTwo);

    }
}
