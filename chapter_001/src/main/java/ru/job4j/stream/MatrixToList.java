package ru.job4j.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatrixToList {
    public static void main(String[] args) {
        System.out.println("matrix of list to list :");
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        System.out.println(
                matrix.stream().flatMap(List::stream).collect(Collectors.toList())
        );
        System.out.println();
        System.out.println("[][] to list :");
        int[][] matrix2 = {
            {1, 2, 3, 4 },
            {5, 6, 7, 8 }
        };
        System.out.println(
       // Arrays.stream(matrix2).flatMap(Stream::of).collect(Collectors.toList())
                Arrays.toString(Stream.of(matrix2).flatMapToInt(Arrays::stream).toArray())
        );

    }

}
