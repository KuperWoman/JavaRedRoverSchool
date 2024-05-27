package school.redrover.lecture7;

public class HW_07_Salary extends HW_07_Employee {

    static int getSum(HW_07_Employee[] employeeArray){
        int sum = 0;

        for (int i = 0; i < employeeArray.length; i++) {
            sum+= employeeArray[i].salary;
        }
        return sum;

    }


}
