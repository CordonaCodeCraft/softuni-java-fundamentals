package _08_ObjectsAndClasses.exercises._03_opinion_poll;

public class  Person {
    private String firstName;
    private int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void printPerson() {
        System.out.printf("%s - %d%n", this.firstName, this.age);
    }

    public String personInfo() {
        return String.format("%s - %d", this.firstName, this.age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
