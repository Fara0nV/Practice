package Serialization47;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjects {
    public static void main(String[] args)  {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){ // try with resources
            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));
            // without close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
