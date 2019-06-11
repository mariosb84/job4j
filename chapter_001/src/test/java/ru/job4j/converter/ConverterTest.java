package ru.job4j.converter;

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

public class ConverterTest {
    /**
     * Test rubleToDollar.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        float result = converter.rubleToDollar(60);
        assertThat(result, is(1.0F));
    }
    /**
     * Test rubleToEuro.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        float result = converter.rubleToEuro(70);
        assertThat(result, is(1.0F));
    }
    /**
     * Test dollarToRuble.
     */
  @Test
    public void when1DollarToRubleThen60() {
        Converter converter = new Converter();
        float result = converter.dollarToRuble(1);
        assertThat(result, is(60.0F));
    }
    /**
     * Test euroToRuble.
     */
    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        float result = converter.euroToRuble(1);
        assertThat(result, is(70.0F));
    }
}
