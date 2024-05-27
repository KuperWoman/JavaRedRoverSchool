package school.redrover.lecture12;

import java.util.*;

public class Set1 {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        mySet.add("Vasya");
        mySet.add("Petya");
        mySet.add("Kolya");
        mySet.add("Vasya");

        System.out.println(mySet.size());
        System.out.println(mySet);

        Set<Person> people = new HashSet<>();
        Person vasya = new Person("Vasya");
        people.add(new Person("Vasya"));
        people.add(new Person("Vasya"));
        people.add(new Person("Nikolaj Petrovich"));
        people.add(vasya);
        people.add(vasya);
        System.out.println(people.size());
        System.out.println(people);

        for (Person p : people) {
            System.out.println(p.name);
        }





    }

    private static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }
    }
}
