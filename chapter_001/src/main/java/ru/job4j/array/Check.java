package ru.job4j.array;
/**
 * Check.
 */
public class Check {
    /**
     * The array is filled with true or false.
     * @param  data - array.
     * @return result.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                result = false;
           }
        }
        return result;
    }
}