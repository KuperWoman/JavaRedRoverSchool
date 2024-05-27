package school.redrover.lecture22;

import java.util.List;

public class NotStreams {
    public static void main(String[] args) {
        System.out.println(
                findBest(List.of("aaa", "bb", "CCCCC"), (first, second) -> first.length() - second.length())
                );
    }
    static interface Comparator<T> {
        int compare(T first, T second);
    }
    static <T> T findBest(List<T> elements, Comparator<T> comparator) {
        if (elements.isEmpty()) return null;
        T champion = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (comparator.compare(champion, elements.get(i)) < 0) {
                champion = elements.get(i);
            }
        }
        return champion;
    }
}
