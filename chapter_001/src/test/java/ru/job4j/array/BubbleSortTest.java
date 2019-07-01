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
public class BubbleSortTest {
    /**
     * Test SortTenElements.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {  //write here a test that checks the sorting of an array of 10 elements using the bubble method, for example {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bubbleSort.sort(input);
        assertThat(result, is(new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8}));


    }
}