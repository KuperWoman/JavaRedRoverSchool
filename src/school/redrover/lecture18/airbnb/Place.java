package school.redrover.lecture18.airbnb;

public abstract class Place {
    private final int id;
    private final int howManySleeps;
    private final double dailyPrice;

    public Place(int id, int howManySleeps, double dailyPrice) {
        this.id = id;
        this.howManySleeps = howManySleeps;
        this.dailyPrice = dailyPrice;
    }

    public int getId() {
        return id;
    }

    public int getHowManySleeps() {
        return howManySleeps;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }
    public String getInfo(){
        return String.format(
                "%s no. %s, sleeps %o for %.2f per day",
                this.getClass().getSimpleName(), getId(), getHowManySleeps(), getDailyPrice());
    }

}
