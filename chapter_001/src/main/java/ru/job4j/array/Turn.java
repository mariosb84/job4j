package ru.job4j.array;
/**
 * Turn.
 */
public class Turn {
    /**
     * Turn the array.
     * @param  array.
     * @return turned array.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
             int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
        return array;
    }


    }

