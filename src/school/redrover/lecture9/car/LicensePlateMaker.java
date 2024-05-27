package school.redrover.lecture9.car;

public class LicensePlateMaker {
    private String pref;
    private int lastUsedNumber;


    public LicensePlateMaker(String pref, int lastUsedNumber) {
        this.pref = pref;
        this.lastUsedNumber = lastUsedNumber;
    }

    LicensePlate makeNextPlate() {
        int nextNumber = lastUsedNumber + 1;
        lastUsedNumber = nextNumber;
        return new LicensePlate(pref + "-" + nextNumber);
    }
}
