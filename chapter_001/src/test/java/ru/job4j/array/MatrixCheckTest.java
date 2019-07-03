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
public class MatrixCheckTest {
    /**
     * Test true.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * Test false.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    /**
     * Test trueEven.
     */
    @Test
    public void whenDataMonoByTrueThenTrueEven() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true, true},
                {false, true, true, true},
                {true, false, true, true},
                {true, true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * Test falseOdd.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalseOdd() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true, true, true},
                {false, true, true, true, false},
                {true, false, true, true, true},
                {true, true, false, true, false},
                {true, true, false, true, false}
                };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}