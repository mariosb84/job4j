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

public class SortingTest {
    /**
     * Test Sorted.
     */
    @Test
    public void whenArraySortedThenTrue() {
            Sorting  sorting = new Sorting();
            int[] input = new int[] {1, 2, 3, 4, 5};
            boolean result = sorting.sort(input);
            assertThat(result, is(true));
    }
    /**
     * Test NotSorted.
     */
    @Test
    public void whenArrayNotSortedThenFalse() {
        Sorting  sorting = new Sorting();
        int[] input = new int[] {1, 20, 3, 4, 5};
        boolean result = sorting.sort(input);
        assertThat(result, is(false));
    }
}