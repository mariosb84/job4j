package ru.job4j.array;
/**
 * FindLoop.
 */
public class FindLoop {
    /**
     * Find the element in the array.
     * @param  data - array, el - element.
     * @return index of the element in the array.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // if the element is not in the array, then we return -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}