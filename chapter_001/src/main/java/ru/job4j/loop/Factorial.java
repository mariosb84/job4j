package ru.job4j.loop;
/**
 * Factorial.
 */
public class Factorial {
    /**
     * Vichislaem factorial.
     * @param  n - pologitelnoe celoe chislo.
     * @return result.
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}