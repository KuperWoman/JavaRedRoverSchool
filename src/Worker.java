public class Worker extends Person{

    String name;
    int age;
    int salary;

    public Worker(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
}
