package PolymorphismStudy;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        test(animal1);
        test(dog);
        test(cat);

    }

    public static void test(Animal animal){
        animal.eat();
    }
}
