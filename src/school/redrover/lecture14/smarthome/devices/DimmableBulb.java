package school.redrover.lecture14.smarthome.devices;

import java.awt.*;

public class DimmableBulb extends LightBulb implements SwitghableAndAbjustable {

    public void adjust(int percent) {
        System.out.println("Light brightness is set at " + percent);
    }

//    @Override
//    public void adjust(int percent) {
//        adjustBrightness(percent);
//    }
}
