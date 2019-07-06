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

public class ArrayDuplicateTest {
    /**
     * Test ("5 words (2 duplicates)").
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Hello", "World", "Hello", "Super", "World"}; //write here a test that checks for the removal of duplicate rows from an array of strings.
        String[] exept = {"Hello", "World", "Super"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(input);
        assertThat(result, is(exept));

    }
}