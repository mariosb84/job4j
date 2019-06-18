package ru.job4j.loop;
/**
 * Summa chetnich chisel.
 */
public class Counter {
    /**
     * Vichislaem summu chetnich chisel.
     * @param  start diapazona, conec diapazona.
     * @return summa.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
         if (i % 2 == 0) {
            sum += i;
           }
        }
        return sum;
    }
}