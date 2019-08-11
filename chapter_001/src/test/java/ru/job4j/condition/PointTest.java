package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Sergei Baranov (mariosb84@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class PointTest {
    /**
     * Test distance.
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }
    /**
     * Test distance3d.
     */
    @Test
    public void whenZeroAndTwentyThenTwenty() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 0, 20);
        double result = first.distance3d(second);
        first.info3d();
        second.info3d();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(20D));
    }
    /**
     * Test checkItself.
     */
    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }
    /**
     * Test checkItself3d.
     */
    @Test
    public void whenCheckItself3d() {
        Point point = new Point(0, 0, 0);
        double result = point.distance3d(point);
        assertThat(result, is(0D));
    }
    /**
     * Test showInfo.
     */
    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }
    /**
     * Test showInfo3d.
     */
    @Test
    public void whenShowInfo3d() {
        Point first = new Point(1, 1, 1);
        first.info3d();
        Point second = new Point(2, 2, 2);
        second.info3d();
    }
}