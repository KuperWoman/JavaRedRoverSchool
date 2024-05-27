package school.redrover.lecture16;

import java.util.List;

public class Comparators {
    public static final GenericComparator <Integer> MORE = new GenericComparator <Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            if (a > b) return 1;
            if (a < b) return -1;
            return 0;
        }
    };

    public static final GenericComparator <Integer> ABS_MORE = new GenericComparator <Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return MORE.compare(Math.abs(a), Math.abs(b));
        }
    };

    public static final GenericComparator<String> LONGEST_STRING = new GenericComparator<String>() {
        @Override
        public int compare(String a, String b) {
            return MORE.compare(a.length(), b.length());
        }
    };

    public static <T> T findUltimateGeneric(List<T> elements, GenericComparator<T> comparator){
        if (elements.isEmpty()) return null;
        T champion = elements.get(0);
        for (int i = 1; i < elements.size(); i++){
            if (comparator.compare(elements.get(i), champion) > 0) {
                champion = elements.get(i);
            }
        }
        return champion;
    }
}
