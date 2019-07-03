package ru.job4j.array;
/**
 * MatrixCheck.
 */
public class MatrixCheck {
    /**
     * The array is filled with true or false.
     * @param  data - array.
     * @return result.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[i][j] != data[i + 1][j + 1]) {
                    result = false;
                }
            }
        }
        return result;
    }
}