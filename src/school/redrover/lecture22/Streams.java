package school.redrover.lecture22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
        public static int getArraySum(int[] arr) {
        return Arrays.stream(arr).sum(); //суммирует элементы в стриме
        }

        public static int getMinElement(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
        }

        public static int [] getNegativeElementAndSort(int[] arr) {
        return Arrays.stream(arr).filter(n -> n < 0).sorted().toArray();
        }

        public static int[] modifyElements(int[] arr) {
        return Arrays.stream(arr).map(x -> x + 1).toArray();
        }

        public static int[] mapListOfStringsToInt(List<String> list) {
        return list.stream().mapToInt(num -> Integer.parseInt(num)).toArray();
        }

        public static int countElementsDividableByTwo(int[] arr) {
        return (int) Arrays.stream(arr).filter(e1 -> e1 % 2 == 0).count();
        }

//        public List<String> getJobNamesList() {
//        return getWait(5).until(ExpectedConditions.visibilityOfAllElements(jobList))
//                .stream()
//                .map(WebElement::getText)
//                .collect(Collectors.toList());
//        }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("3", "6", "8", "14", "15");
        int[] arr = {-1, -3, -5, 0, 13, 44, -8, 23, 19, 25, -12};

        System.out.println("Sum of elements: " + getArraySum(arr));
        System.out.println("Min element: " + getMinElement(arr));
        System.out.println("Elements dividable by two: " + countElementsDividableByTwo(arr));

        System.out.println("Negative elements: " + Arrays.toString(getNegativeElementAndSort(arr)));
        System.out.println("Elements modofied by 1: " + Arrays.toString(modifyElements(arr)));
        System.out.println("Arr of ints:" + Arrays.toString(mapListOfStringsToInt(list)));

        Stream<String> stream = list.stream();
        Stream<String> stream1 = list.stream();

        int[] arr1 = stream.mapToInt(num -> Integer.parseInt(num)).toArray();
        int[] arr2 = stream1.mapToInt(num -> Integer.parseInt(num)).filter(n -> (n % 2) == 0).toArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    }