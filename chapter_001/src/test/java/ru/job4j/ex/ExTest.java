package ru.job4j.ex;

import org.junit.Test;

public class ExTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNlessThanZero() {
        Fact fact = new Fact();
        fact.calc(-1);
    }
}
