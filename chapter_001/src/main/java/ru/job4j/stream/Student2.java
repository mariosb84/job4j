package ru.job4j.stream;

import java.util.Objects;

public class Student2 {
    private int score2;

    private String surname2;

    public Student2(String surname2, int score2) {
        this.score2 = score2;
        this.surname2 = surname2;
    }

    public int getScore2() {
        return score2;
    }

    public String getSurname2() {
        return surname2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student2 student2 = (Student2) o;
        return score2 == student2.score2
                && Objects.equals(surname2, student2.surname2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score2, surname2);
    }
}
