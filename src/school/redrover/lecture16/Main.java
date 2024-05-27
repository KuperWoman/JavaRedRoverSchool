package school.redrover.lecture16;

import java.lang.reflect.GenericDeclaration;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, -34, 0, 47, -6, 873);
        System.out.println(findMax(ints));
        System.out.println(findMax(Collections.emptyList()));
        System.out.println(findMax(List.of(999)));

        List<String> strings = List.of("qq", "234", "qwertyuiop", "zxcvbnm,./////dfgh");
        System.out.println(findLongest(strings));


//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < ints.size(); i++){
//            if (ints.get(i) > max) {
//                max = ints.get(i);
//            }
    }

//    static Integer findUltimate(List<Integer> elements, IntegerComparator comparator){
//        if (elements.isEmpty()) return null;
//        int champion = elements.get(0);
//        for (int i = 0; i < elements.size(); i++) {
//            if (comparator.compare(elements.get(i), champion) > 0) {
//                champion = elements.get(i);
//            }
//        }
//        return champion;
//    }



    static String findLongestG(List<String> elements) {
        return Comparators.findUltimateGeneric(elements, Comparators.LONGEST_STRING);
    }

    static Integer findMax(List<Integer> elements) {
        return Comparators.findUltimateGeneric(elements, Comparators.MORE);
//        if (elements.isEmpty()) return null;
//        int champion = elements.get(0);
//        for (int i = 0; i < elements.size(); i++) {
//            if (elements.get(i) > champion) {
//                champion = elements.get(i);
//            }
//        }
//        return champion;
    }

    static Integer findMin(List<Integer> elements) {
        GenericComparator<Integer> comparator = new IntegerLess();
        return Comparators.findUltimateGeneric(elements, comparator);

//        if (elements.isEmpty()) return null;
//        int champion = elements.get(0);
//        for (int i = 0; i < elements.size(); i++) {
//            if (elements.get(i) < champion) {
//                champion = elements.get(i);
//            }
//        }
//        return champion;
    }

    static String findLongest(List<String> elements){
        if(elements.isEmpty()) return null;
        String longest = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if(elements.get(i).length() > longest.length()){
                longest = elements.get(i);
            }
        }
        return longest;
    }
}




