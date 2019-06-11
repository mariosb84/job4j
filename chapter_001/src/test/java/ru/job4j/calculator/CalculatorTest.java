package ru.job4j.calculator;

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

public class CalculatorTest  {
    /**
     * Test add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test subtract.
     */
@Test
    public void whenSubtractTwoMinusOneThenOne()  {
        Calculator calc = new Calculator();
        double result = calc.subtract(2D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * Test div.
     */
@Test
    public void whenDivFourNaTwoThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.div(4D, 2D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test multiple.
     */
@Test
    public void whenMultipleFourNaTwoThenEight()  {
        Calculator calc = new Calculator();
        double result = calc.multiple(4D, 2D);
        double expected = 8D;
        assertThat(result, is(expected));
    }
}