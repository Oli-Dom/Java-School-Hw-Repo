import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver_SchoolDB {

    // *Created methods that write to the new file */
    public static void courseWriter(Course c) {
        PrintWriter outStream = null;
        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt", true));
            outStream.println(c.toString());
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + "SchoolDB_Updated.txt");
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }

    }

    public static void personWriter(Person p) {
        PrintWriter outStream = null;
        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt", true));
            outStream.println(p.toString());
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + "SchoolDB_Updated.txt");
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }

    }

    public static void facultyWriter(Faculty f) {
        PrintWriter outStream = null;
        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt", true));
            outStream.println(f.toString());
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + "SchoolDB_Updated.txt");
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }

    }

    public static void employeeWriter(Employee em) {
        PrintWriter outStream = null;
        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt", true));
            outStream.println(em.toString());
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + "SchoolDB_Updated.txt");
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }

    }

    public static void genStaffWriter(GeneralStaff gs) {
        PrintWriter outStream = null;
        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt", true));
            outStream.println(gs.toString());
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + "SchoolDB_Updated.txt");
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }

    }

    public static void studentwriter(Student s) {
        PrintWriter outStream = null;
        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt", true));
            outStream.println(s.toString());
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + "SchoolDB_Updated.txt");
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }

    }

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

        // (5 pts) Create the Objects as specified from the file content
        // * Course Objects */
        Course MAT1 = new Course(true, 771, "MAT", 4);

        // *Faculty Objects */
        Faculty f1 = new Faculty();
        Faculty f2 = new Faculty(true);
        Faculty f3 = new Faculty("MAT", false);
        Faculty f4 = new Faculty("Superman", 1938, "PHY", true);

        // *Student Objects */
        Student s1 = new Student();
        Student s2 = new Student(false);
        Student s3 = new Student("Math", false);
        Student s4 = new Student("Wonderwoman", 1941, "JST", true);

        // *General staff objects */
        GeneralStaff gS1 = new GeneralStaff();
        GeneralStaff gS2 = new GeneralStaff("advise students");
        GeneralStaff gS3 = new GeneralStaff("Sanitation", "clean");
        GeneralStaff gS4 = new GeneralStaff("Flash Gordon", 1934, "Security", "safety");

        // *Rest of the course objects */
        Course CMP1 = new Course(true, 777, "CMP", 4);
        Course CMP2 = new Course(true, 711, "CMP", 4);
        Course MAT2 = new Course(true, 723, "MAT", 4);
        Course CMP4 = new Course(false, 168, "CMP", 4);
        Course CMP5 = new Course(false, 338, "CMP", 4);

        // *Begin formatting updated file */

        PrintWriter outStream = null;
        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt", true));
            outStream.println();
            outStream.println("**************************************************************");
            outStream.println("SCHOOL DATABASE INFO:");
            outStream.println();
            outStream.println("************************************************");
            outStream.print("COURSES:");
            outStream.println();
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + "SchoolDB_Updated.txt");
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }

        // *Using method to write to updated file */
        courseWriter(MAT1);
        courseWriter(CMP1);
        courseWriter(CMP2);
        courseWriter(MAT2);
        courseWriter(CMP4);
        courseWriter(CMP5);
        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt", true));
            outStream.println("************************************************");
            outStream.println("************************************************");
            outStream.println("PERSONS:");
            outStream.println("************************************************");
            outStream.println("************************************************");
            outStream.println("EMPLOYEES:");
            outStream.println("************************************************");
            outStream.println("************************************************");
            outStream.println("GENERAL STAFF:");
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + "SchoolDB_Updated.txt");
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }
        genStaffWriter(gS1);
        genStaffWriter(gS2);
        genStaffWriter(gS3);
        genStaffWriter(gS4);

        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt", true));
            outStream.println("************************************************");
            outStream.println("************************************************");
            outStream.println("FACULTY:");
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + "SchoolDB_Updated.txt");
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }

        facultyWriter(f1);
        facultyWriter(f2);
        facultyWriter(f3);
        facultyWriter(f4);

        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt", true));
            outStream.println("************************************************");
            outStream.println("************************************************");
            outStream.println("STUDENTS:");
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + "SchoolDB_Updated.txt");
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }

        studentwriter(s1);
        studentwriter(s2);
        studentwriter(s3);
        studentwriter(s4);

        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt", true));
            outStream.println("************************************************");
            outStream.println("**************************************************************");
            outStream.println();
        } catch (FileNotFoundException e) {
            System.err.println("Could not create the file " + "SchoolDB_Updated.txt");
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                outStream.close();
            }
        }

        String fPath = "SchoolDB_Updated.txt";
        File fileNeem = new File(fPath);

        try {
            Scanner scanner = new Scanner(fileNeem);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fPath);
        }

    } // end of main

} // end of class
