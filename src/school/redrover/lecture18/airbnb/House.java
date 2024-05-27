package school.redrover.lecture18.airbnb;

public class House extends WholePlace {
    private final double yardArea;

    public House(int id, int howManySleeps, double dailyPrice, int bedrooms, int bathrooms, double yardArea) {
        super(id, howManySleeps, dailyPrice, bedrooms, bathrooms);
        this.yardArea = yardArea;
    }

    public double getYardArea() {
        return yardArea;
    }
}
