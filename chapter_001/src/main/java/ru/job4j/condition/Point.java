package ru.job4j.condition;

        import static java.lang.Math.pow;
        import static java.lang.Math.sqrt;

/**
 * Rasstoyanie mezhdu 2 tochkami.
 */

public class Point {
    /**
     * Rasschitivaem rasstoyanie po formule.
     * @param x1,x2,y1,y2 - 4 tochki.
     * @return rezultat vichislenii.
     */
    /**
     *This is an object field. It is available only to a specific object.
     */
    private int x;

    /**
     * And this is the field of the object. It is available only to a specific object.
     */
    private int y;
    /**
     * A constructor that takes the initial state of a point object
     *       * @param first x coordinate
     *       * @param second y coordinate
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}