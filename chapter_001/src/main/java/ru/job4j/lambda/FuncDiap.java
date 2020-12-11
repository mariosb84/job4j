package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FuncDiap {
    public static List<Double>  diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (int i = start; i < end; i++) {
                rsl.add(func.apply((double) i));
        }
        return rsl;
    }
    public static void main(String[] args) {
        System.out.println("Линейная :");
        System.out.println(diapason(5, 8, x -> 2 * x + 1));
        System.out.println("Квадратичная :");
        System.out.println(diapason(5, 8, x -> 2 * Math.pow(x, 2) + 3 * x + 1));
        System.out.println("Показательная :");
        System.out.println(diapason(5, 8, x -> Math.pow(2, x)));
    }

}
