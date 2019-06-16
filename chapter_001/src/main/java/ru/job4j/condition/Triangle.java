package ru.job4j.condition;
/**
 * Ploshad treugolnika.
 */

public class Triangle {

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
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            // write a formula for calculating the area of a triangle.
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}