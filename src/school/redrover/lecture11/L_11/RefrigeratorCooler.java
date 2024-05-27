package school.redrover.lecture11.L_11;

public class RefrigeratorCooler extends Cooler {

    private boolean isFridgeOpen;

    public RefrigeratorCooler(int temperatureIWant) {
        super(temperatureIWant);
    }

    @Override
    protected boolean isCurrentlyCooling() {
        return isFridgeOpen;
    }

    @Override
    protected void stopCooling() {
        System.out.println("Close thr fridge");
        isFridgeOpen = false;

    }

    @Override
    protected void startCooling() {
        System.out.println("Open the fridge");
        isFridgeOpen = true;

    }
}
