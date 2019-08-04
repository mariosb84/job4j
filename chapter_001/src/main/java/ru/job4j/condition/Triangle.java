package ru.job4j.condition;
/**
 * Ploshad treugolnika.
 */

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    /**
     * Method of calculating the half-perimeter by side lengths.
     *
     * Formula.
     *
     * (a + b + c) / 2
     *
     * @param a distance between points a b
     * @param b distance between points a c
     * @param c distance between points b c
     * @return semi-perimeter.
     */
    public double period(double a, double b, double c) {

        return (a + b + c) / 2;
    }

    /**
     * The method checks whether it is possible to build a triangle with such lengths of sides.
     *
     * Consider the condition you need to write to determine if you can build a triangle.
     *
     * @param a Length from point a b.
     * @param b Length from point a c.
     * @param c Length from point b c.
     * @return true or false
     */
private boolean exist(double a, double b, double c) {
        return  !((a + b) <= c) && (!((b + c) <= a)) && !((a + c) <= b);

        }

/**
 * The method must calculate the area of the triangle.
 *
 * Formula.
 *
 * v p *(p - a) * (p - b) * (p - c)
 *
 * where v is the square root, use the method to extract the root Math.sqrt().
 *
 * @return Return area if triangle exists or -1.
 */
public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
        // write a formula for calculating the area of a triangle.
        rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
        }
}
