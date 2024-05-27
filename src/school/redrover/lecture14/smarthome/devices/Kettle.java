package school.redrover.lecture14.smarthome.devices;

public class Kettle implements Switchable{
    public void turnOn(){
        System.out.println("Heating water");
    }

    public void turnOff(){
        System.out.println("Not heating water");
    }

}
