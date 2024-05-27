package school.redrover.lecture18.airbnb;

public class WholePlace extends Place {
    private final int bedrooms;
    private final int bathrooms;

    public WholePlace(int id, int howManySleeps, double dailyPrice, int bedrooms, int bathrooms) {
        super(id, howManySleeps, dailyPrice);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }
}
