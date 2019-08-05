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
        // Create a point object.
        Point first1 = new Point(0, 0);
        Point second1 = new Point(0, 2);
        Point third1 = new Point(2, 0);
        // Create a triangle object.
        Triangle triangle = new Triangle(first1, second1, third1);
        // Calculate the area.
        double result = triangle.area();
        // Set the expected result.
        double expected = 2D;
        //Check the result and the expected value.
        assertThat(result, closeTo(expected, 0.1));

    }
}