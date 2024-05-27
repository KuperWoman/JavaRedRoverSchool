package school.redrover.lecture14.smarthome.control;

import school.redrover.lecture14.smarthome.devices.Adjustable;
import school.redrover.lecture14.smarthome.devices.DimmableBulb;
import school.redrover.lecture14.smarthome.devices.SwitghableAndAbjustable;

public class DimmerSwitch extends Switch{
    private Adjustable device;

    public DimmerSwitch(SwitghableAndAbjustable device) {
        super(device);
        this.device = device;
    }

//    public void turnOn() {
//        device.turnOn();
//    };
//    public void turnOff() {
//        device.turnOff();
//    };
    public void adjust(int percent) {
        device.adjust(percent);
    };

}
