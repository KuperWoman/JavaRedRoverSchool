package school.redrover.lecture18.month;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Month> winter = List.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);

        System.out.println(winter);

        for (Month month : winter) {
            System.out.println(month.name() + ": " + month.getDays() + month.getWorkingDaysIn(2024));
        }

        System.out.println(Arrays.toString(Month.values()));

        System.out.println(Month.valueOf("MARCH"));
//        System.out.println(Month.valueOf("DFGHJKL"));


        long address = 5;
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < address; i += 2) {
            even.add(i);
        }
        System.out.println(even);


    }
}
