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
        int resultFirstMoreSecond = first > second ? first : second;
        int resultThirdMoreFirstSecond = third > resultFirstMoreSecond ? third : resultFirstMoreSecond;
        return resultThirdMoreFirstSecond;
    }
}