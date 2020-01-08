package Wildcards34;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> ListOfAnimal = new ArrayList<>();
        ListOfAnimal.add(new Animal(1));
        ListOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());
        test(ListOfAnimal);
        test(listOfDogs);
        /*
        Object ---- > super
        Animal ---- > extends
        Dog
         */
    }

    private static void test(List<? extends Animal> list){        // Wildcards
        for(Animal animal : list){
            animal.eat();
        }
    }
}
