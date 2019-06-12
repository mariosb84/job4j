package ru.job4j.condition;
/**
 * Rasstoyanie mezhdu 2 tochkami.
 */

public class Point {
    /**
     * Rasschitivaem rasstoyanie po formule.
     * @param x1,x2,y1,y2 - 4 tochki.
     * @return rezultat vichislenii.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }
}