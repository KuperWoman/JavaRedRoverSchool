package school.redrover.lecture18.airbnb;

import school.redrover.lecture18.comparator.Comparators;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Room(1, 2, 20).getInfo());

        List<House> houses = List.of(
                new House(11, 5, 200, 3, 2, 1000),
                new House(12, 8, 500, 6, 4, 10000)
        );

        List<Room> rooms = List.of(
                new Room(21, 1, 20.0),
                new Room(22, 2, 40.00)
        );

        List<Place> all = new ArrayList<>();


        all.addAll(houses);
        all.addAll(rooms);

        System.out.println(Comparators.findBest(houses, Comparators.BIGGEST_YARD).getInfo());
        System.out.println(Comparators.findBest(houses, Comparators.BIGGEST_YARD.reverse()).getInfo());

        System.out.println(Comparators.findBest(all, Comparators.MOST_EXPENSIVE).getInfo());
        System.out.println(Comparators.findBest(all, Comparators.MOST_EXPENSIVE.reverse()).getInfo());

        System.out.println(Comparators.findBest(houses, Comparators.MOST_EXPENSIVE).getInfo());

        /*
        List<House> не подкласс List<Place>, хотя House - подкласс Place
        List<Room> не подкласс List<Place>, хотя Room - подкласс Place
        List<House> - подкласс Collection<House>
        List<T> - extends Collection<T>
        List<House> НЕ extends List<Place>
        */

        System.out.println("========================================");

        printList(all);
        printList(rooms);

        System.out.println(Comparators.findBest(houses, Comparators.MOST_EXPENSIVE).getInfo());

    }

    public static void printList(List<? extends Place> places) {
        for (Place place : places) {
            System.out.println(place.getInfo());
        }
    }
}