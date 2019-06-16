package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;
/**
 * Test.
 *
 * @author Sergei Baranov (mariosb84@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    /**
     * Test area(0, 0, 0, 2, 2, 0).
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Create a triangle object.
        Triangle triangle = new Triangle();
        // Calculate the area.
        double result = triangle.area(0, 0, 0, 2, 2, 0);
        // Set the expected result.
        double expected = 2D;
        //Check the result and the expected value.
        assertThat(result, closeTo(expected, 0.1));
    }
}