package ru.job4j.array;
/**
 * BubbleSort.
 */
public class BubbleSort {
    /**
     * Bubble sorting.
     * @param array.
     * @return sorted array.
     */
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int b = array.length - 1; b >= i; b--) {
                if (array[b - 1] > array[b]) {
                    int temp = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = temp;
                }
            }


        }
        return array;
    }


}