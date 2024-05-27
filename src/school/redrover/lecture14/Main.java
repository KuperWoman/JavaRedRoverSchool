package school.redrover.lecture14;

import school.redrover.lecture14.smarthome.control.DimmerSwitch;
import school.redrover.lecture14.smarthome.control.Switch;
import school.redrover.lecture14.smarthome.control.SwitchBoard;
import school.redrover.lecture14.smarthome.devices.*;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> ints1 = List.of(1, 2, 3, 4, 5);
//        ints1.add(12);

        Stereo stereo = new Stereo();
        DimmerSwitch dimmerSwitch = new DimmerSwitch(stereo);
        dimmerSwitch.switchToOn();
        dimmerSwitch.adjust(30);
        dimmerSwitch.switchToOff();

        DimmableBulb bulb3 = new DimmableBulb();
        DimmerSwitch dimmerSwitch2 = new DimmerSwitch(bulb3);
        dimmerSwitch2.switchToOn();
        dimmerSwitch2.adjust(30);
        dimmerSwitch2.switchToOff();

        Switch simpleSwitch = new Switch(stereo);
        simpleSwitch.switchToOn();
        simpleSwitch.switchToOff();

        System.out.println("-------------------------------------");
        LightBulb bulb1 = new LightBulb();
        LightBulb bulb2 = new LightBulb();
        Kettle kettle = new Kettle();

        SwitchBoard board = new SwitchBoard();
        board.addDevice(bulb1);
        board.addDevice(bulb2);
        board.addDevice(kettle);
        Switch mainSwitch = new Switch(board);

        mainSwitch.switchToOn();
        mainSwitch.switchToOff();



        System.out.println("-------------------------------------");
        LightBulb bulb = new LightBulb();
        Kettle chajnik = new Kettle();
        Switch switch1 = new Switch(bulb);
        Switch switch2 = new Switch(chajnik);

        DimmerSwitch switch3 = new DimmerSwitch(new SwitghableAndAbjustable() {
            @Override
            public void adjust(int percent) {

            }

            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }
        });

        switch1.switchToOn();
        switch2.switchToOn();
        switch2.switchToOff();
        switch1.switchToOff();
        switch3.switchToOn();
        switch3.adjust(50);
        switch3.switchToOff();


        System.out.println("-------------------------------------");
        List<Grade> grades = Collections.nCopies(5, new Grade(1));
        System.out.println(grades);
        grades.get(0).setGrade(5);
        System.out.println(grades);

        List<String> strings = Collections.nCopies(10, "--");
        System.out.println(strings);
        List<Integer> ints = Collections.nCopies(3, 0);
        System.out.println(ints);

    }

    static class Grade{
        private int grade;

        public Grade(int grade) {
            this.grade = grade;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.valueOf(grade);
        }
    }
    }
