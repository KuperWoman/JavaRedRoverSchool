package school.redrover.lecture11.L_11;

import school.redrover.lecture11.L_11.Cooler;

public class WindowCooler extends Cooler {

    private boolean isWindowOpen;
    public WindowCooler(int targetTemp) {
        super(targetTemp);
    }

    @Override
    protected boolean isCurrentlyCooling() {
        return isWindowOpen;
    }

    @Override
    protected void stopCooling() {
        System.out.println("Closing the window");
        isWindowOpen = false;

    }

    @Override
    protected void startCooling() {
        System.out.println("Opening the window");
        isWindowOpen = true;

    }
}
