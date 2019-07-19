package ru.job4j.array;
import org.junit.Test;
<<<<<<< HEAD
//import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.Is.is;
=======
import static org.hamcrest.Matchers.is;                                           
//import static org.hamcrest.core.Is.is;
>>>>>>> da4f4be5df2531c16382613648e0c133024e5e59
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Sergei Baranov (mariosb84@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class TurnTest {
    /**
     * Test TurnEven.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }
    /**
     * Test TurnOdd.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {            //write here a test that checks the flip of an array with an odd number of elements, for example {1, 2, 3, 4, 5}.
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}