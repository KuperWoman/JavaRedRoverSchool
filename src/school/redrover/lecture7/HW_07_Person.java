package school.redrover.lecture7;

import java.sql.Array;

public class HW_07_Person {

    String name;
    int age;
    char sex;


    String getName() {
        String result = "";
        if (Character.toLowerCase(sex) == 'm') {
            result = "Mr. ";
        }
        else if (Character.toLowerCase(sex) == 'f') {
            result = "Mrs. ";
        }
        return result + name;
    }
}




