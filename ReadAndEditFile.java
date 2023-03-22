import java.io.*;
import java.util.*;

public class ReadAndEditFile {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String fileName = null;

        // Prompt user to enter file name until a valid file is entered
        while (true) {
            System.out.print("What is the name of your file? (Enter 'quit' to exit) ");
            fileName = dd.nextLine();
            if (fileName.equalsIgnoreCase("quit")) {
                System.out.println("Exiting program.");
                return;
            }
            File file = new File(fileName);
            if (file.exists()) {
                // Read from file and capitalize first letter of every sentence
                String output = "";
                try (Scanner fileScanner = new Scanner(file)) {
                    while (fileScanner.hasNextLine()) {
                        String line = fileScanner.nextLine();
                        String[] sentences = line.split("(?<=[.!?])\\s+");
                        for (String sentence : sentences) {
                            output += (sentence.substring(0, 1).toUpperCase() + sentence.substring(1).toLowerCase()
                                    + " ");
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                // Remove duplicate spaces
                output = output.replaceAll("\\s+", " ");

                // Write modified output to file
                try (PrintWriter writer = new PrintWriter("HomeworkOutput6-2.txt")) {
                    writer.println(output);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            } else {
                System.out.println("File Not Found " + fileName);
            }
        }
    }
}
