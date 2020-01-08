package Exceptions37Part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args)  {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Exception in main method");
        }
        File file = new File("Test2");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("After Scanner'a ");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("After try catch");
    }
    public static void readFile() throws FileNotFoundException{
        File file = new File("HN");
        Scanner scanner1 = new Scanner(file);
    }
}
