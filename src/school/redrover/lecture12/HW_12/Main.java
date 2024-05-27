package school.redrover.lecture12.HW_12;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();
        lst.add("White");
        lst.add("Tan");
        lst.add("Yellow");
        lst.add("Orange");
        lst.add("Red");
        lst.add("Pink");
        lst.add("Purple");
        lst.add("Blue");
        System.out.println(lst);

        lst.removeIf(color -> color.toLowerCase().contains("l"));

        System.out.println(lst);
        System.out.println("==================================================================");


        List<Integer> lst2 = new ArrayList<>();
        for(int i = 100; i <= 1000; i++){
            lst2.add(i);
        }

        System.out.println(lst2);
        System.out.println("------------------------------------------------------------------");

        for(int i = 0; i < lst2.size(); i++) {

            if(lst2.get(i) % 2 == 0){
                lst2.remove(i);
            }
        }
        System.out.println(lst2);
        System.out.println("==================================================================");


        List<String>lst3 = new ArrayList<>(List.of("prediction", "bang", "plastic", "smash", "teach", "jockey",
                "strip", "house", "firefighter", "accident", "cruelty", "gene",
                "pleasant", "concentration", "inspire", "wake", "acceptable", "safe",
                "element", "evolution", "coast", "treasurer", "lick", "serve",
                "instrument", "committee", "wild", "complex", "dragon", "animal"));

        System.out.println(lst3);
        System.out.println("------------------------------------------------------------------");
        Collections.sort(lst3);
        System.out.println(lst3);
        System.out.println("------------------------------------------------------------------");

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < lst3.size(); i++) {
            String x = map.getOrDefault(lst3.get(i).charAt(0), "");
            if (lst3.get(i).length() > x.length()) {

                map.put(lst3.get(i).charAt(0), lst3.get(i));
            }
        }

        System.out.println(map);

    }
}
