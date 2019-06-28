package ru.job4j.array;
/**
 * Square.
 */
public class Square {
    /**
     * Fill the array with square powers.
     * @param  bound - array size.
     * @return array elements.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {   // fill the array through the loop with elements from 1 to bound squared
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}
