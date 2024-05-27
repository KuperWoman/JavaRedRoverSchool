package school.redrover.lecture10.review;

public class R_10_Person extends Object {
    private String firstName;
    private String lastName;
    private int age;

    public R_10_Person(String firstName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getAsString() {
        return "first name: " + firstName +
                "\nlast name: " + lastName +
                "\nage: " + age;
    }

    public String toString() {
        return getAsString();
    }
    public void printMe(){
        System.out.println(getAsString());
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;


    }
}
