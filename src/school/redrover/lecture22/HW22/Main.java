package school.redrover.lecture22.HW22;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("№1");
        List<Integer> integers = List.of(1, 2, 3, 4);
        System.out.println(getAverage(integers));

        System.out.println(integers
                .stream()
                .collect(Collectors.averagingDouble(n -> n)));

        System.out.println("№2");
        List<String> str = List.of("I", "love", "streams", "and", "lambdas");
        System.out.println(getToUpperCase(str));

        System.out.println("№3");
        System.out.println(getSumOfOdds(integers));

        System.out.println(integers
                .stream()
                .filter(n -> n % 2 == 1)
                .reduce((a, b) -> a + b));

        System.out.println("№4");
        System.out.println(sortingReverseAlphabetical(str));

        System.out.println(str
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList());

        System.out.println("№5");
        System.out.println(getSecondBigNum(integers));

//        System.out.println(integers
//                .stream()
//                .sorted(Comparator.reverseOrder())
//                .skip(integers.size() - 2)
//                .reduce((first, second) -> first));

        //№6
        System.out.println(getMinMaxSumAver(integers));

        IntSummaryStatistics stats = Arrays.asList(1,2,3,4)
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());
        System.out.println(stats.getMin());
        System.out.println(stats.getMax());
    }

    //Задача №1
    //Написать метод, который найдет среднее значение в списке целых чисел
    static double getAverage(List<Integer> integers) {
        return integers.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }

    //Задача №2
    //Написать метод, который переведет каждый элемент списка строк в верхний регистр
    static List<String> getToUpperCase(List<String> str) {
        return str.stream()
                .map(s -> s.toUpperCase())
                .toList();
    }

    //Задача №3
    //Написать метод, который посчитает сумму всех нечетных чисел в списке целых чисел
    static int getSumOfOdds(List<Integer> integers) {
        return integers.stream()
                .mapToInt(i -> i)
                .filter(i -> i % 2 != 0)
                .sum();
    }

    //Задача №4
    //Написать метод, который отсортирует список строк по алфавиту в обратном порядке
    static List<String> sortingReverseAlphabetical(List<String> strings) {
        return strings.stream()
                .map(s -> s.toUpperCase()) // как сделать без изменения регистра??
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    //Задача №5
    //Написать метод, который найдет второе с конца по величине число в списке чисел
    static int getSecondBigNum(List<Integer> integers) {
        return integers.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("List is empty or contains only one item"));
    }

    //Задача №6
    //Написать метод, который за один проход найдет минимум, максимум, сумму и среднее значение списка целых чисел

    static class Acc {
        private double min = Integer.MAX_VALUE;
        private double max = Integer.MIN_VALUE;
        private double sum = 0;
        private double avg;
        private double acc = 0.0;

        public void getMin(int i) {
            min = Math.min(i, min);
        }

        public void getMax(int i) {
            max = Math.max(i, max);
        }

        public void getSum(int i) {
            sum += i;
        }

        public void getAver(int i) {
            acc += 1;
            avg = sum / acc;
        }

        @Override
        public String toString() {
            return String.format("min = %d, max = %d sum = %d, avg = %.1f", (int)min, (int)max, (int)sum, avg);
        }
    }

    public static Acc getMinMaxSumAver(List<Integer> integers) {
        return integers.stream()
                .reduce(new Acc(),
                        (acc, integer) -> {
                            acc.getMin(integer);
                            acc.getMax(integer);
                            acc.getSum(integer);
                            acc.getAver(integer);
                            return acc;
                        },
                        (acc, integer) -> {
                            return acc;
                        }
                );
    }
}