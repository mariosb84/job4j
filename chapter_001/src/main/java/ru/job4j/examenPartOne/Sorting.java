package ru.job4j.examenpartone;
/**
 * Sorting.
 */
public class Sorting {
    /**
     * Sorting the array.
     * @param  array.
     * @return sorted array or not sorted.
     */
    public boolean sort(int[] array) {
        boolean sorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                sorted = false;
                break;
            }

        }
        return sorted;
    }

}
