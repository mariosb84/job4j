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
     * And this is the field of the object. It is available only to a specific object.
     */
    private int z;
    /**
     * A constructor that takes the initial state of a point object
     *       * @param first x coordinate
     *       * @param second y coordinate
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    /**
     * A constructor that takes the initial state of a point object
     *       * @param first x coordinate
     *       * @param second y coordinate
     *       * @param third z coordinate
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
    public void info3d() {
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 1, 3);
        Point d = new Point(0, 2, 4);
        double dist = a.distance(b);
        double distTwo = c.distance3d(d);
        System.out.println(dist);
        System.out.println(distTwo);
    }
}