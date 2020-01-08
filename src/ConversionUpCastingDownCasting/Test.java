package ConversionUpCastingDownCasting;

public class Test {
    public static void main(String[] args) {
        Animal animal12 = new Dog();               // Upcasting

        // Downcasting                     // WARNING !!!!!!!!!!
        Dog dog2 = (Dog) animal12;
        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark();

    }
}
