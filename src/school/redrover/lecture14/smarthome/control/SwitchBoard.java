package school.redrover.lecture14.smarthome.control;

import school.redrover.lecture14.smarthome.devices.Switchable;

import java.util.ArrayList;
import java.util.List;

public class SwitchBoard implements Switchable{
    private List<Switchable> allSwitchables = new ArrayList<> ();

    @Override
    public void turnOn() {
        for (Switchable device : allSwitchables) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        for (Switchable device : allSwitchables) {
            device.turnOff();
        }
    }

    public void addDevice(Switchable device) {
        allSwitchables.add(device);
    }
}
