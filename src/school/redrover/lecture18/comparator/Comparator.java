package school.redrover.lecture18.comparator;

public interface Comparator<T> {
    int compare(T a, T b);

    default Comparator<T> reverse() {
        return reverseOrder(this);
    }

    private static <T> Comparator<T> reverseOrder(Comparator<T> original) {
        return new Comparator<T>() {
            @Override
            public int compare(T a, T b) {
                return original.compare(a, b) * -1;
            }
        };
    }

}
