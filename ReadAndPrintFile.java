import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAndPrintFile {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String fileName = "";
        boolean sentinel = true;

        while (sentinel) {
            System.out.println("What is the name of your file?");
            fileName = dd.next();

            Scanner inStream = null;
            String lineFromFile = "";
            try {
                inStream = new Scanner(new File(fileName));
                while (inStream.hasNextLine()) {
                    lineFromFile = inStream.nextLine();
                    System.out.println(lineFromFile);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found " + fileName);
                sentinel = true;
            } finally {
                if (inStream != null) {
                    inStream.close();
                    sentinel = false;
                }
            }
        }

    }
}
