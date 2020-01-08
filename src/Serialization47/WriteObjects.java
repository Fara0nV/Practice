package Serialization47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        Person[] people = {new Person(1,"Tom"),new Person(2,"Bob"),new Person(3,"Mike")};
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
           oos.writeObject(people);
            // without it oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }