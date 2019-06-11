package ru.job4j.converter;

/**
 * Converter valuti.
 */
public class Converter {

    /**
     * Convertiruem rubli v evro.
     * @param value rubli.
     * @return Euro.
     */
    public int rubleToEuro(int value) {
        return (float) value/70;
    }

    /**
     * Convertiruem rubli v dollari.
     * @param value rubli.
     * @return Dollari
     */
    public int rubleToDollar(int value) {
        return (float) value/60;
    }
/**
     * Convertiruem evro v rubli.
     * @param value euro.
     * @return Rubli.
     */
    public int euroToRuble(int value) {
        return (float) value*70;
    }

    /**
     * Convertiruem dollari v rubli.
     * @param value dollari.
     * @return Rubli
     */
    public int dollarToRuble(int value) {
        return (float) value*60;
    }
}