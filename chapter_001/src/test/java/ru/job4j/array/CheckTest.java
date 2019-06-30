package ru.job4j.array;
/**
 * Test.
 *
 * @author Sergei Baranov (mariosb84@mail.ru)
 * @version $Id$
 * @since 0.1
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    /**
     * Test DataTrue.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * Test DataFalse.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    /**
     * Test DataTrueAndEven.
     */
    @Test
    public void whenDataMonoByTrueAndEvenThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * Test DataFalseAndOdd.
     */
    @Test
    public void whenDataNotMonoByTrueAndOddThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, true, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}