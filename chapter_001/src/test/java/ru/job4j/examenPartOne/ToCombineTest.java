package ru.job4j.examenpartone;
/**
 * Test.
 *
 * @author Sergei Baranov (mariosb84@mail.ru)
 * @version $Id$
 * @since 0.1
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ToCombineTest {
    /**
     * Test ThirdArraySorted.
     */
    @Test
    public void whenTwoArraysSortedThenThirdSorted() {
        ToCombine  toCombine = new ToCombine();
        int[] input1 = new int[] {1, 2, 3, 4, 5};
        int[] input2 = new int[] {6, 7, 8, 9, 10};
        int[] result = toCombine.merge(input1, input2);
        assertThat(result, is(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}