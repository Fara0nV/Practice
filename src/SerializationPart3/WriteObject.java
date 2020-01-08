package SerializationPart3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
                Person[] people = {new Person(1,"Tom"),new Person(2,"Bob"),new Person(3,"Mike")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

           oos.writeObject(people);


            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }