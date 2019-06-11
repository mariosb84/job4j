package ru.job4j.calculator;
/**

* Calculator.
*
*@author Sergei Baranov (mariosb84@mail.ru)
*/

public class Calculator {
/**
     * Method add.
     * @param double first, double second.
     * @return double first plus double second.
     */

    public double add(double first, double second) {
        return first + second;
    }
/**
     * Method subtract.
     * @param double first, double second.
     * @return double first minus double second.
     */

public double subtract(double first, double second) {
        return first - second;
    }
/**
     * Method div.
     * @param double first, double second.
     * @return double first razdelit na double second.
     */

public double div(double first, double second) {
        return first / second;
    }
/**
     * Method multiple.
     * @param double first, double second.
     * @return double first umnozghit na double second.
     */

public double multiple(double first, double second) {
        return first * second;
    }
}