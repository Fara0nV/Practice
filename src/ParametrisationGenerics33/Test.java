package ParametrisationGenerics33;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
         /////////////Java5 ///////////
        List animals = new  ArrayList();
        animals.add("cat");  // 0
        animals.add("dog"); // 1
        animals.add("frog");

        String animal = (String) animals.get(1);    // ----> downcasting
        System.out.println(animal);
        /////////// With Generics ///////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");  // 0
        animals2.add("dog"); // 1
        animals2.add("frog");

        String animal2 = animals2.get(0);
        System.out.println(animal2);
    }
}
