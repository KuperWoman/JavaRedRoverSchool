import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Codewars {

    public static String reverseWords(String str) {

        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        System.out.println();

        return String.join(" ", words);
    }

//        public static String reverseWords(String str){
//            String[] arr = str.split(" ");
//            List<String> s = new ArrayList<>();
//            for(String word : arr){
//                s.add(word);
//            }
//            Collections.reverse(s);
//
//            return  String.join(" ", s);
////
//        }


    public static String smash(String... words) {
        StringBuilder s = new StringBuilder();
        for (String st : words) s.append(st).append(" ");
        return s.toString().trim();
    }

    static public boolean AmIAfraid(final String day, final int num) {


        return switch (day) {
            case "Monday" -> num == 12;
            case "Tuesday" -> num > 95;
            case "Wednesday" -> num == 34;
            case "Thursday" -> num == 0;
            case "Friday" -> num % 2 == 0;
            case "Saturday" -> num == 56;
            case "Sunday" -> Math.abs(num) == 666;
            default -> true;
        };

    }

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        String[] arr = phrase.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
        }

        return String.join(" ", arr);


    }

    public static boolean feast(String beast, String dish) {

        Map<String, String> feast = new HashMap<>();

        String firstBeast = beast.charAt(0) + "";
        String firstDish = dish.charAt(0) + "";
        String lastBeast = beast.charAt(beast.length() - 1) + "";
        String lastDish = dish.charAt(dish.length() - 1) + "";

        feast.put(firstBeast, firstDish);
        feast.put(lastBeast, lastDish);


        return feast.get(0).equals(feast.get(1));

    }

    public static int getCount(String str) {
        System.out.println(str);
        int count = 0;
        for (String letter : str.split("")) {
            if ("aeiou".contains(letter)) {
                count++;
                System.out.println(letter);

            }
        }

        return count;
    }


    }











