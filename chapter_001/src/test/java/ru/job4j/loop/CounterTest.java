package ru.job4j.loop;

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
public class CounterTest {
    /**
     * Test sum of even  (0, 10).
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() { //write code here 
       Counter counter = new Counter();
        int result = counter.add(0, 10);
        assertThat(result, is(30));  
    }
}