package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Sergei Baranov (mariosb84@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class MultiMaxTest {
    /**
     * Test Second max.
     */
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    /**
     * Test First max.
     */
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 4, 2);
        assertThat(result, is(5));
    }
    /**
     * Test Third max.
     */
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 4, 20);
        assertThat(result, is(20));
    }
    /**
     * Test when all numbers are equal.
     */
    @Test
    public void whenAllNumbersAreEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(7, 7, 7);
        assertThat(result, is(7));
    }
}