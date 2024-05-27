package school.redrover.lecture22;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 5, 43, 2, 5, -23, 0);
        List<String> words = List.of("some", "ran1dom", "List", "of", "words", "axx");

        List<Integer> result = new ArrayList<>();
        for (int i : integers) {
            result.add(i * 2);
        }

        List<Integer> result1 = new ArrayList<>();
        for (String s : words) {
            result1.add(s.length());
        }

        System.out.println(result);
        System.out.println(result1);

        List<Integer> lengths = words.stream() // Stream<String>
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return s.length();
                    }
                }) // Stream<Integer>
//                .toList(); // List<Integer>
                .collect(Collectors.toList()); // List<Integer>

        List<Integer> lengths1 = words.stream()
                .map(s -> s.length())
                .filter(i -> i < 5)
                .distinct()
                .toList();

        System.out.println(lengths);
        System.out.println(lengths1);

        System.out.println(words.stream()
                .flatMap(word -> word.chars().mapToObj(i -> (char) i))
//                .anyMatch(c -> c == 'x'))
                .allMatch(c -> {
                    boolean isLetter = Character.isAlphabetic(c);
                    boolean isNumber = Character.isDigit(c);
                    return isLetter || isNumber;
                }));
//                .allMatch(c -> Character.isAlphabetic(c)));

        System.out.println(words
                .stream()
                .reduce((a, b) -> a.length() > b.length() ? a : b)
        );

        System.out.println(Stream.empty().reduce((a, b) -> a));

        System.out.println(Optional.ofNullable(null));
        System.out.println(Optional.of("xxxxx"));

        System.out.println(stringLength("XXX").orElse(0));
        System.out.println(stringLength(null).orElse(0));

        System.out.println(
                integers.stream()
                        .reduce(
                                0,
                                (acc, number) -> acc + number,
                                (sum1, sum2) -> sum1 + sum2
                        )
        );
        System.out.println(integers.stream().reduce((a, b) -> a + b));
        System.out.println(integers.stream().reduce(0, (a, b) -> a + b));

        Stream<Integer> mystream = Stream.iterate(1, i -> i + 1)
                .filter(i -> i%2 == 0)
                .peek(System.out::println)
//                .map(i -> {
//                    System.out.println(i);
//                    return i;
//                })
                .map(i -> i * 3);
        System.out.println("==============================");
        System.out.println(mystream.limit(20)
                .collect(Collectors.toUnmodifiableList()));

        System.out.println(words
                .stream()
                .flatMap(s -> s.chars().mapToObj(i -> (char) i))
                .collect(Collectors.groupingBy(c -> c))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue().size()))
//                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().size()))
        );
    }

    static Optional<Integer> stringLength(String s) {
        return Optional.ofNullable(s).map(x -> x.length());

    }
 }