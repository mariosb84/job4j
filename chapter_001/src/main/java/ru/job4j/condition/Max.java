package ru.job4j.condition;
/**
 * Max.
 */
public class Max {
    /**
     *Ñalculates a larger value.
     * @param first value,second value.
     * @return result.
     */
    public int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }
}