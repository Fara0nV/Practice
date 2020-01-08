package ua.faraon.unit8;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int value;
        do{
            System.out.println("Insert 5");
            value = s.nextInt();
        }while(value!=5);

        System.out.println("You insert 5");
    }
}
