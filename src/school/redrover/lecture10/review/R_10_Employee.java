package school.redrover.lecture10.review;

public class R_10_Employee extends R_10_Person{

    public double salary;
    public String jobTitle;

    public R_10_Employee(String name, int age, double salary) {
        super(name, age);

        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    @Override
    public String getAsString(){
        return super.getAsString() +
                "\nsalary: " + salary +
                "\njob title: " + jobTitle;

    }

    @Override
    public String toString(){
        return "Employee{" +
                "salary=" + salary +
                ", jobtitle=" + jobTitle + "}";


    }

}
