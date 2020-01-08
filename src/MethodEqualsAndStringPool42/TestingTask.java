package MethodEqualsAndStringPool42;

public class TestingTask {
    public static void main(String[] args) {
        String string1 = "Hello";                     //   string1 --> {"Hello}
        String string2 = "Hello";                     //                 /\
        // animal1 --->              {1}              //    string2    ---|
        // animal2 --->              {1}
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        String q = "hello";
        String r = "hello123".substring(0,5);
        System.out.println(r);
        System.out.println(q == r);

        System.out.println(string1.equals(string2));     // string1 == string2 --> String pool


    }
}

class Animal{
    private int id;

    public Animal(int id) {
        this.id = id;
    }
    public boolean equals(Object obj){
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
