package ru.job4j.idealweight;

/**
 * Programma rascheta idealnogo vesa.
 */
public class Fit {

    /**
     * Ideal weight for men.
     * @param height Rost.
     * @return ideal weight.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Ideal weight for women.
     * @param height Rost.
     * @return ideal weight.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}
