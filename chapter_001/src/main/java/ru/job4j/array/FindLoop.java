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
<<<<<<< HEAD
        int rst = -1; // if the element is not in the array, then we return -1.
=======
        int rst = -1; // if the element is not in the array, then return -1.
>>>>>>> da4f4be5df2531c16382613648e0c133024e5e59
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}