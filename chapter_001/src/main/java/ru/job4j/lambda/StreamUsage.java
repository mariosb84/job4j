package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{"
                    + "name='" + name + '\''
                    + ", spent=" + spent
                    + '}';
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);
        System.out.println();
        System.out.println("Задание - Отфильтровать положительные числа :");
        List<Integer> numbers = List.of(
                -1, -456, 600, 458, -1234, 151, 155, 160, 200, -500, -800, 345, -4546, 90, 120
        );
        System.out.println("Исходный массив :");
        System.out.println(numbers);
        System.out.println();
        System.out.println("Отфильтрованный список положительных чисел :");
        System.out.println();
        List<Integer> numbersFilterPlus = numbers.stream().filter(
                number -> number > 0
        ).collect(Collectors.toList());
        numbersFilterPlus.forEach(System.out::println);
    }
}
