public class Person {

    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        System.out.println(this.name);

        return name;
    }

    int getAge() {

        return age;
    }

}
