package WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Test2");
        PrintWriter pw = new PrintWriter(file);             // only txt
        pw.println("Test row 1");                           // writing
        pw.println("Test row 2");                           // writing
        pw.close();
    }
}
