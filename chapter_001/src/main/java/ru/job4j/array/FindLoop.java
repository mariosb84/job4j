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
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}