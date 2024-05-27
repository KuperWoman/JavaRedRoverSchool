package school.redrover.lecture12;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

//    List (1, 2, 3, 4, 5);
//    Set; //не имеет линейности, как лист и это набор уникальных элементов
//    Map (1 - Вася); // ключ - значение
//        (2 - Макс);

        List<String> myList = new ArrayList<>();
        myList.add("ed0");
        myList.add("ed1");
        myList.add("ed2");
        myList.add("ed3");
        myList.add("ed4");
        myList.add("ed5");
        myList.add("ed6");
        System.out.println(myList.isEmpty());
        System.out.println(myList.size());
        System.out.println(myList);
        System.out.println(myList.get(5));
//        myList.clear();
        myList.remove(4);
        System.out.println(myList);

        List<Integer> myIntList = List.of(2, 5, 7, 9, 0, -13, 1);
        System.out.println(myIntList);
//        myIntList.add(50);
        System.out.println("------------------------------");

        Set<String> mySet = new HashSet<>(); // коллекция уникальных значений
        mySet.add("ad1");
        mySet.add("ad2");
        mySet.add("ad3");
        mySet.add("ad4");
        mySet.add("ad5");
        mySet.add("ad1"); // повтор не учитывает, но ощибку не выдает
        System.out.println(mySet);
        System.out.println(mySet.size());
        Set<Person> people = new HashSet<>();
        //Person ed = new Person("Ed");
        //Person max = new Person("Max");
//        people.add("max");
//        people.add("max");
        people.add(new Person("Ed"));
        people.add(new Person("Ed"));


        Map<Integer, String> people1 = new HashMap<>();
        people1.put(1, "Ed");
        people1.put(2, "Max");
        people1.put(3, "Bob");
        System.out.println(people1);
        System.out.println("----------------------------");

        Map<Integer, Person> people2 = new HashMap<>();
        people2.put(1, new Person("Ed"));
        people2.put(2, new Person("Max"));
        people2.put(3, new Person("Bob"));
        people2.put(4, new Person("John"));
        System.out.println(people2);






    }
    private static class Person{
        public final String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString(){
            return  "Person name " + name;
        }
    }
}
