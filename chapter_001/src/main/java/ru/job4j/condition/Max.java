package ru.job4j.condition;
/**
 * Max.
 */
public class Max {
    /**
     *Calculates a larger value.
     * @param first value,second value.
     * @return result.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
    /**
     *Calculates a larger value.
     * @param first value,second value, third value.
     * @return result.
     */
    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }
    /**
     *Calculates a larger value.
     * @param first value,second value, third value,four value.
     * @return result.
     */
    public int max(int first, int second, int third, int four) {
        return max(first, max(second, third, four));

    }
}