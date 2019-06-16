package ru.job4j.condition;
/**
 * MultiMax.
 */
public class MultiMax {
    /**
     *Calculates a larger value.
     * @param first value,second value,third value.
     * @return maximum result.
     */
    public int max(int first, int second, int third) {
        int result1 = first > second ? first : second;
        int result2 = third > result1 ? third : result1;
        return result2;
    }
}