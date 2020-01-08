package ReadFromFilePart2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFilePart2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Test2");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int [] numbers = new int[7];
        int counter = 0;
        for(String number:numbersString){
            numbers[counter++]= Integer.parseInt(number);

        }
        System.out.println(Arrays.toString(numbers));      //can not without toString
        scanner.close();
    }
}