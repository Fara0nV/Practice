package ua.faraon.unit7;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Insert anything");
        String  myString = myScanner.nextLine();     // int t = myScanner.nextInt;
        System.out.println("You insert " + myString);
    }
}
