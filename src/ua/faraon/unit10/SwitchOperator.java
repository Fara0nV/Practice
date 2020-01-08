package ua.faraon.unit10;

import java.util.Scanner;

public class SwitchOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert age");
        int age = s.nextInt();
        switch (age){
            case 0 :
                System.out.println("Born");
                break;
            case 7 :
                System.out.println("Go to school");
                break;
            case 18 :
                System.out.println("You finished school");
                break;
            default:
                System.out.println("Don't correct age");
        }
    }
}
