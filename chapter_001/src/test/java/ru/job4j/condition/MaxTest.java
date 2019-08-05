package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Sergei Baranov (mariosb84@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    /**
     * Test first max.
     */
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
    /**
     * Test second max.
     */
    @Test
    public void whenMax4To3Then4() {
        Max max = new Max();
        int result = max.max(4, 3);
        assertThat(result, is(4));
    }
    /**
     * Test numbers are equal.
     */
    @Test
    public void whenMax5To5Then5() {
        Max max = new Max();
        int result = max.max(5, 5);
        assertThat(result, is(5));
    }
    /**
     * Test third max.
     */
    @Test
    public void whenMax3To4To5Then5() {
        Max max = new Max();
        int result = max.max(3, 4, 5);
        assertThat(result, is(5));
    }
    /**
     * Test four max.
     */
    @Test
    public void whenMax4To5To6To7Then7() {
        Max max = new Max();
        int result = max.max(4, 5, 6, 7);
        assertThat(result, is(7));
    }
}