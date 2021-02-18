package ru.job4j.examenpartone;
/**
 * ToCombine.
 */
public class ToCombine {
    /**
     * Add two sorted arrays.
     * @param  left - array1.
     * @param  right - array2.
     * @return sorted array3.
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = left.length - 1, j = right.length - 1, k = result.length;

        while (k > 0) {
            result[--k] =
                    (j < 0 || (i >= 0 && left[i] >= right[j])) ? left[i--] : right[j--];
        }
        return result;
    }

}