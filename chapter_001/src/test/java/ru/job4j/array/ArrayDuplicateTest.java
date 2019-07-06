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
        String[] input = {"Hello", "World", "Hello", "Super", "World"}; //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        String[] exept = {"Hello", "World", "Super"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(input);
        assertThat(result, is(exept));

    }
}