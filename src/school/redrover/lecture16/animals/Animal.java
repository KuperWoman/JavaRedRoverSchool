package school.redrover.lecture16.animals;

public class Animal {

    String name;
    double weight;
    double canLiftWeight;

    public Animal(String name, double weight, double canLiftWeight) {
        this.name = name;
        this.weight = weight;
        this.canLiftWeight = canLiftWeight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCanLiftWeight() {
        return canLiftWeight;
    }
}
