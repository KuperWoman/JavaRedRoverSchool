package school.redrover.lecture11.HW_11.month;

public final class Month {

    private String monthName;
    private int numberOfDays;
    private int numberOfWorkingDays;

    public Month(String monthName, int numberOfDays, int numberOfWorkingDays) {
        this.monthName = monthName;
        this.numberOfDays = numberOfDays;
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    public String getMonthName() { return monthName; }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }

    @Override
    public String toString() {
        return monthName ;
    }
}
