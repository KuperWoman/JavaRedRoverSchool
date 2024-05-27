package school.redrover.lecture16;

public class IntegerLess implements GenericComparator<Integer>{


    @Override
    public int compare(Integer a, Integer b) {
        if ( a < b) return 1;
        if ( a > b) return -1;
        return 0;
    }
}
