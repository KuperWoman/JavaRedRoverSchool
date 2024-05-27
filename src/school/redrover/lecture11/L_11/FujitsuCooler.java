package school.redrover.lecture11.L_11;

public class FujitsuCooler  extends Cooler{
//    private int targetTemp;
    private boolean isAcOn;
//    private int delta;


    public FujitsuCooler(int targetTemp) {
        super(targetTemp);
    }

    private Fujitsu123 myFujitsu;

//    protected int getTargetTemp(){
//        return targetTemp;
//    }

//    public void adjustTemp(int currentTemp) {
//        if (currentTemp >= getTargetTemp() && !isCurrentlyCooling()) {
//            turnAcOn();
//            System.out.println("Turning On");
//        } else if (currentTemp < getTargetTemp() && isCurrentlyCooling()) {
//            turnAcOff();
//            System.out.println("Turning Off");
//        } else {
//            System.out.println("Nothing to do");
//        }
//    }

    protected void stopCooling() {
        // send Bluetooth OFF signal
        myFujitsu.turnOff();
        this.isAcOn = false;
    }

    protected void startCooling() {
        // send Bluetooth ON signal
        myFujitsu.turnOn();
        this.isAcOn = true;
    }

    protected boolean isCurrentlyCooling(){
        return isAcOn;
    }

    private static class Fujitsu123 {
        void turnOn() {
            System.out.println("Fujitsu123 ON");
        }

        void turnOff() {
            System.out.println("Fujitsu123 OFF");
        }
    }

        }
