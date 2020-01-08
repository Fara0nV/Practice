package ua.faraon.unit14;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Vadym";
        person1.age = 31;
        System.out.println("My name is "+ person1.name + " and me "+person1.age + " ears");
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 61;
        System.out.println("My name is "+ person2.name + " and me "+person2.age + " ears");
    }
}
class Person{
    String name;
    int age;
}
