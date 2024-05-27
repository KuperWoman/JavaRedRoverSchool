package school.redrover.lecture14.smarthome.control;

import school.redrover.lecture14.smarthome.devices.LightBulb;
import school.redrover.lecture14.smarthome.devices.Switchable;

public class Switch {

    private final Switchable switchable;

    public Switch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void switchToOn() {
        switchable.turnOn();
    }

    public void switchToOff() {
        switchable.turnOff();
    }


}
