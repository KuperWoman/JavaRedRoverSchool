package school.redrover.lecture9.month;

public class HW_09_Employee {

    private String name;
    private int age;
    private String sex;
    private double dailySalary;


    public HW_09_Employee(String name, int age, String sex, double salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dailySalary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSalary(double salary) {
        this.dailySalary = salary;
    }

    public String getName() {return name; }

    public int getAge() {
        return age;
    }

    public String getSex(Month[] months) { return sex; }

    public double getSalary() {
        return dailySalary;
    }

    double getSalary(Month[] monthArray) {
        double sum = 0;
        for (int i = 0; i < monthArray.length; i++) {
           sum += monthArray[i].getNumberOfWorkingDays() * dailySalary;
        }
        return sum;


     //       double sum = 0;
//       for(school.redrover.lecture9.month.Month x : monthArray) {
//          sum += x.numberOfWorkingDays * this.salary;
//       }
//       return sum;
    }

    int workingDaysPerYear (Month[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            count += arr[i].getNumberOfWorkingDays();
        }
        return count;
    }

}
