import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver_SchoolDB {
    public static void main(String[] args) {
        // (5 pts) Read from file (the path and filename should be
        // “SchoolDB_Initial.txt”)
        // (5 pts) Display the plain text file content on the conso
        String filePath = "SchoolDB_Initial.txt";
        File fileName = new File(filePath);

        try {
            Scanner scanner = new Scanner(fileName);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }

    } // end of main
} // end of class
