package school.redrover.lecture12;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String, Person> people = new HashMap<>();
        people.put("200x", new Person("Vasya"));
        people.put("110", new Person("Petr"));
        System.out.println(people);
        people.put("-456", new Person("Nikolaj"));
        System.out.println(people);

        people.put("110", new Person("Petr Petrovich"));
        System.out.println(people.get("200x"));
        System.out.println(people.get("20xxx"));
        System.out.println(people.getOrDefault("200x", new Person("AAAAAA")));
        System.out.println(people.getOrDefault("20xxx", new Person("AAAAAA")));

        for(String key : people.keySet()){
            System.out.println("Key = " + key + ", value = " + people.get(key));
        }


        Map<Character, Integer> charCounts = new HashMap<>();
        String string = "sdfghjklwertyuiopxcvbnm,.sdfghjklqwertyuiop[;.,mnbvwazx";
        for(char c : string.toCharArray()){
            int currentCount = charCounts.getOrDefault(c, 0);
            charCounts.put(c, currentCount + 1);

        }
        System.out.println(charCounts);


    }

    private static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person " + name ;
        }
    }
}
