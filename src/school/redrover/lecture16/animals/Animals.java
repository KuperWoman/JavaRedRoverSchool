package school.redrover.lecture16.animals;

import school.redrover.lecture16.GenericComparator;

public class Animals {
    private Animals() {}

    public static final Animal TIGER = new Animal("Тигр", 550, 1100);
    public static final Animal ELEPHANT = new Animal("Слон", 4400, 6800);
    public static final Animal BEAR = new Animal("Медведь", 500, 500);
    public static final Animal ANT = new Animal("Муравей", 0.000003, 0.00006);
    public static final Animal DUNG_BEETLE = new Animal("Навозный жук", 0.02, 2.282);

    public static final GenericComparator<Animal> HEAVIEST = new GenericComparator<Animal>() {
        @Override
        public int compare(Animal a, Animal b) {
            if (a.getWeight() > b.getWeight()) return 1;
            if (a.getWeight() < b.getWeight()) return -1;
            return 0;
        }
    };

    public static final GenericComparator<Animal> STRONGEST = new GenericComparator<Animal>() {
        @Override
        public int compare(Animal a, Animal b) {
            double relativeWeightA = a.getCanLiftWeight()/a.getWeight();
            double relativeWeightB = b.getCanLiftWeight()/b.getWeight();
            if (relativeWeightA > relativeWeightB) return 1;
            if (relativeWeightA < relativeWeightB) return -1;
            return 0;
        }
    };

}
