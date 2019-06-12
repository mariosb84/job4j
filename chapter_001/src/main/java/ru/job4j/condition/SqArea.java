package ru.job4j.condition;
/**
 * Ploshad pramougolnika.
 */
public class SqArea {
    /**
     * Vichislaem ploshad pramougolnika.
     * @param  p- perimetr,  k - koefficient.
     * @return Ploshad.
     */
    public int square(int p, int k){
        int w  ;
        int h ;
        int s;
        h = p / ((2 * k)+ 2);
        w = h * k;
        s = w * h;
        return s;
    }
}