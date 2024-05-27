package school.redrover.lecture11.L_11;

public abstract class Cooler {

    private final int targetTemp;

    public Cooler(int targetTemp) {
        this.targetTemp = targetTemp;
    }

    protected int getTargetTemp(){
        return targetTemp;
    }

    public final void adjustTemp(int currentTemp) {
        if (currentTemp >= getTargetTemp() && !isCurrentlyCooling()) {
            System.out.println("Turning On");
            startCooling();
        } else if (currentTemp < getTargetTemp() && isCurrentlyCooling()) {
            System.out.println("Turning Off");
            stopCooling();
        } else {
            System.out.println("Nothing to do");
        }
    }

    protected abstract boolean isCurrentlyCooling();

    protected abstract void stopCooling();

    protected abstract void startCooling();


}
