
//*https://youtu.be/QDHv_by0kW4 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Driver_SchoolDB {

    // *Print menu method */
    public static void printMenu() {
        String text = "What would you like to do:\n" +
                " A.Create 3 new Course objects based on input\n" +
                // " B.Create 3 new Faculty objects based on input\n" +
                // " C.Create 3 new GeneralStaff objects based on input\n" +
                // " D.Create 3 new Student objects based on input\n" +
                " E.Add 2 new Courses to a Faculty object\n" +
                " F.Add 2 new Courses to a Student object\n" +
                " G.Add an array of 2 Courses to a Faculty object\n" +
                " H.Add an array of 2 Courses to a Student object\n" +
                " I.Get the Course at index (valid and invalid indexes) from a Faculty object\n" +
                " J.Get the Course at index (valid and invalid indexes) from a Student object\n" +
                " K.Allow the user to select a Faculty object and a Course object from menus and query the Faculty object for the Course to determine whether the Faculty object teaches it or not.\n"
                +
                " L.Determine which Faculty object teaches the most and the least courses.\n" +
                " M.Determine which Course is the minimum of all Course objects in the catalog.\n" +
                " N.Determine which Course is the maximum of all Course objects in the catalog.\n" +
                " O.Determine which Student has the most and least credits. \n" +
                "Type: \"exit\" to exit";

        int length = text.length() - 870;

        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("| " + text + " |");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();

    }

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

        Course[] courseStorage = new Course[100];
        Person[] personStorage = new Person[100];
        Employee[] employeeStorage = new Employee[100];
        GeneralStaff[] generalStaffStorage = new GeneralStaff[100];
        Faculty[] facultyStorage = new Faculty[100];
        Student[] studentStorage = new Student[100];

        // *Place existing objects into storage arrays */
        courseStorage[0] = MAT1;
        courseStorage[1] = CMP1;
        courseStorage[2] = CMP2;
        courseStorage[3] = MAT2;
        courseStorage[4] = CMP4;
        courseStorage[5] = CMP5;

        facultyStorage[0] = f1;
        facultyStorage[1] = f2;
        facultyStorage[2] = f3;
        facultyStorage[3] = f4;

        studentStorage[0] = s1;
        studentStorage[1] = s2;
        studentStorage[2] = s3;
        studentStorage[3] = s4;

        generalStaffStorage[0] = gS1;
        generalStaffStorage[1] = gS2;
        generalStaffStorage[2] = gS3;
        generalStaffStorage[3] = gS4;

        // *Beggining of the menu */

        String response = "";
        Scanner dd = new Scanner(System.in);
        Scanner ifScanner = new Scanner(System.in);
        String ifResponse = "";
        Boolean isGrad = true;
        int courseNum = 0;
        int courseCreds = 0;
        int i = 0;
        int courseStorageTracker = 6;
        do {
            printMenu();
            response = dd.next();
            // *CASE A */
            if (response.equalsIgnoreCase("A")) {

                while (i < 3) {

                    System.out.println(
                            "Separated by a comma enter u for undergraduate or g or graduate, the course number, the dept, and the credits for course:");
                    ifResponse = ifScanner.nextLine();
                    String[] responseArray = ifResponse.split(",");
                    if (responseArray[0].equalsIgnoreCase("u")) {
                        isGrad = false;
                    } else if (responseArray[0].equalsIgnoreCase("g")) {
                        isGrad = true;
                    } else {
                        System.out.println("Enter a valid letter for graduate status");
                    }

                    if (Integer.parseInt(responseArray[1]) < 0) {
                        System.out.println("Enter a valid course number");
                    } else {
                        courseNum = Integer.parseInt(responseArray[1]);
                    }

                    if (Integer.parseInt(responseArray[3]) < 0) {
                        System.out.println("Enter a valid number of credits");
                    } else {
                        courseCreds = Integer.parseInt(responseArray[3]);
                    }
                    Course c = new Course(isGrad, courseNum, responseArray[2], courseCreds);
                    courseStorage[courseStorageTracker] = c;
                    courseStorageTracker++;
                    i++;

                }
                printMenu();
                response = ifScanner.next();

            }

            // *CASE E */

            if (response.equalsIgnoreCase("e")) {
                Course[] methodCourses = new Course[2];
                int methodLooper = 0;
                int methodCorseTracker = 0;
                int facultySelector = 0;
                System.out.println("Which faculty object do you want to add 2 courses to? (enter the number)");
                for (i = 0; i < facultyStorage.length; i++) {
                    if (facultyStorage[i] != null) {

                        System.out.println(i + " " + facultyStorage[i].toString());
                    }
                }

                facultySelector = ifScanner.nextInt();

                System.out.println("Enter the details for the courses:");
                while (methodLooper < 2) {

                    System.out.println(
                            "Separated by a comma enter u for undergraduate or g or graduate, the course number, the dept, and the credits for course:");
                    ifResponse = ifScanner.nextLine();
                    String[] responseArray = ifResponse.split(",");
                    if (responseArray[0].equalsIgnoreCase("u")) {
                        isGrad = false;
                    } else if (responseArray[0].equalsIgnoreCase("g")) { // changed from "u" to "g"
                        isGrad = true;
                    } else {
                        System.out.println("Enter a valid letter for graduate status");
                        continue;
                    }

                    if (Integer.parseInt(responseArray[1]) < 0) {
                        System.out.println("Enter a valid course number");
                    } else {
                        courseNum = Integer.parseInt(responseArray[1]);
                    }

                    if (Integer.parseInt(responseArray[3]) < 0) {
                        System.out.println("Enter a valid number of credits");
                    } else {
                        courseCreds = Integer.parseInt(responseArray[3]);
                    }
                    Course c = new Course(isGrad, courseNum, responseArray[2], courseCreds);
                    courseStorage[courseStorageTracker] = c;
                    methodCourses[methodCorseTracker] = c;
                    courseStorageTracker++;
                    methodCorseTracker++;
                    methodLooper++;
                }
                facultyStorage[facultySelector].addCoursesTaught(methodCourses);
                printMenu();
                response = ifScanner.next();
            }

            // *Case F */
            if (response.equalsIgnoreCase("f")) {
                Course[] methodCourses = new Course[2];
                int methodLooper = 0;
                int methodCorseTracker = 0;
                int studentSelector = 0;
                System.out.println("Which student object do you want to add 2 courses to? (enter the number)");
                for (i = 0; i < studentStorage.length; i++) {
                    if (studentStorage[i] != null) {

                        System.out.println(i + " " + studentStorage[i].toString());
                    }
                }
                studentSelector = ifScanner.nextInt();

                System.out.println("Enter the details for the courses:");
                while (methodLooper < 2) {

                    System.out.println(
                            "Separated by a comma enter u for undergraduate or g or graduate, the course number, the dept, and the credits for course:");
                    ifResponse = ifScanner.nextLine();
                    String[] responseArray = ifResponse.split(",");
                    if (responseArray[0].equalsIgnoreCase("u")) {
                        isGrad = false;
                    } else if (responseArray[0].equalsIgnoreCase("g")) { // changed from "u" to "g"
                        isGrad = true;
                    } else {
                        System.out.println("Enter a valid letter for graduate status");
                        continue;
                    }

                    if (Integer.parseInt(responseArray[1]) < 0) {
                        System.out.println("Enter a valid course number");
                    } else {
                        courseNum = Integer.parseInt(responseArray[1]);
                    }

                    if (Integer.parseInt(responseArray[3]) < 0) {
                        System.out.println("Enter a valid number of credits");
                    } else {
                        courseCreds = Integer.parseInt(responseArray[3]);
                    }
                    Course c = new Course(isGrad, courseNum, responseArray[2], courseCreds);
                    courseStorage[courseStorageTracker] = c;
                    methodCourses[methodCorseTracker] = c;
                    courseStorageTracker++;
                    methodCorseTracker++;
                    methodLooper++;
                }
                studentStorage[studentSelector].addCoursesTaken(methodCourses);
                System.out.println(studentStorage[studentSelector].toString());
                printMenu();
                response = ifScanner.next();
            }

            // *Case G */
            if (response.equalsIgnoreCase("g")) {
                Course[] methodCourses = new Course[2];
                int methodLooper = 0;
                int methodCorseTracker = 0;
                int facultySelector = 0;
                System.out.println("Which student object do you want to add 2 courses to? (enter the number)");
                for (i = 0; i < facultyStorage.length; i++) {
                    if (facultyStorage[i] != null) {

                        System.out.println(i + " " + facultyStorage[i].toString());
                    }
                }
                facultySelector = ifScanner.nextInt();

                System.out.println("Enter the details for the courses:");
                while (methodLooper < 2) {

                    System.out.println(
                            "Separated by a comma enter u for undergraduate or g or graduate, the course number, the dept, and the credits for course:");
                    ifResponse = ifScanner.nextLine();
                    String[] responseArray = ifResponse.split(",");
                    if (responseArray[0].equalsIgnoreCase("u")) {
                        isGrad = false;
                    } else if (responseArray[0].equalsIgnoreCase("g")) { // changed from "u" to "g"
                        isGrad = true;
                    } else {
                        System.out.println("Enter a valid letter for graduate status");
                        continue;
                    }

                    if (Integer.parseInt(responseArray[1]) < 0) {
                        System.out.println("Enter a valid course number");
                    } else {
                        courseNum = Integer.parseInt(responseArray[1]);
                    }

                    if (Integer.parseInt(responseArray[3]) < 0) {
                        System.out.println("Enter a valid number of credits");
                    } else {
                        courseCreds = Integer.parseInt(responseArray[3]);
                    }
                    Course c = new Course(isGrad, courseNum, responseArray[2], courseCreds);
                    courseStorage[courseStorageTracker] = c;
                    methodCourses[methodCorseTracker] = c;
                    courseStorageTracker++;
                    methodCorseTracker++;
                    methodLooper++;
                }
                facultyStorage[facultySelector].addCoursesTaught(methodCourses);

                System.out.println(facultyStorage[facultySelector].toString());
                printMenu();
                response = ifScanner.next();
            }
            // *Case H */
            if (response.equals("h")) {
                Course[] methodCourses = new Course[2];
                int methodLooper = 0;
                int methodCorseTracker = 0;
                int studentSelector = 0;
                System.out.println("Which student object do you want to add 2 courses to? (enter the number)");
                for (i = 0; i < studentStorage.length; i++) {
                    if (studentStorage[i] != null) {

                        System.out.println(i + " " + studentStorage[i].toString());
                    }
                }
                studentSelector = ifScanner.nextInt();

                System.out.println("Enter the details for the courses:");
                while (methodLooper < 2) {

                    System.out.println(
                            "Separated by a comma enter u for undergraduate or g or graduate, the course number, the dept, and the credits for course:");
                    ifResponse = ifScanner.nextLine();
                    String[] responseArray = ifResponse.split(",");
                    if (responseArray[0].equalsIgnoreCase("u")) {
                        isGrad = false;
                    } else if (responseArray[0].equalsIgnoreCase("g")) { // changed from "u" to "g"
                        isGrad = true;
                    } else {
                        System.out.println("Enter a valid letter for graduate status");
                        continue;
                    }

                    if (Integer.parseInt(responseArray[1]) < 0) {
                        System.out.println("Enter a valid course number");
                    } else {
                        courseNum = Integer.parseInt(responseArray[1]);
                    }

                    if (Integer.parseInt(responseArray[3]) < 0) {
                        System.out.println("Enter a valid number of credits");
                    } else {
                        courseCreds = Integer.parseInt(responseArray[3]);
                    }
                    Course c = new Course(isGrad, courseNum, responseArray[2], courseCreds);
                    courseStorage[courseStorageTracker] = c;
                    methodCourses[methodCorseTracker] = c;
                    courseStorageTracker++;
                    methodCorseTracker++;
                    methodLooper++;
                }
                studentStorage[studentSelector].addCoursesTaken(methodCourses);
                System.out.println(studentStorage[studentSelector].toString());
                printMenu();
                response = ifScanner.next();
            }

            // *Case I */
            if (response.equalsIgnoreCase("i")) {
                int facultySelector = 0;
                int outTracker = 0;
                System.out.println("Which faculty object course do you want to see?");
                for (i = 0; i < facultyStorage.length; i++) {
                    if (facultyStorage[i] != null) {

                        System.out.println(i + " " + facultyStorage[i].toString());
                        outTracker++;
                    }
                }

                facultySelector = ifScanner.nextInt();

                while (facultySelector < 0 || facultySelector >= outTracker) {
                    System.out.println("Invalid index, enter a proper one");
                    facultySelector = ifScanner.nextInt();

                }

                System.out.println("Which course do you want to pick? pick a number from 0-"
                        + (facultyStorage[facultySelector].getNumCoursesTaught() - 1));
                int responseInt = ifScanner.nextInt();
                while (responseInt < 0 || responseInt > facultyStorage[facultySelector].getNumCoursesTaught()) {
                    System.out.println("Enter valid number");
                    responseInt = ifScanner.nextInt(facultyStorage[facultySelector].getNumCoursesTaught());
                }

                System.out.println(facultyStorage[facultySelector].getCourseTaughtAsString(responseInt));
                printMenu();
                response = ifScanner.next();
            }

            // *Case J */
            if (response.equalsIgnoreCase("j")) {
                int StudentSelector = 0;
                int outTracker = 0;
                System.out.println("Which faculty object course do you want to see?");
                for (i = 0; i < studentStorage.length; i++) {
                    if (studentStorage[i] != null) {

                        System.out.println(i + " " + studentStorage[i].toString());
                        outTracker++;
                    }
                }

                StudentSelector = ifScanner.nextInt();

                while (StudentSelector < 0 || StudentSelector >= outTracker) {
                    System.out.println("Invalid index, enter a proper one");
                    StudentSelector = ifScanner.nextInt();

                }

                System.out.println("Which course do you want to pick? pick a number from 0-"
                        + (studentStorage[StudentSelector].getNumCoursesTaken() - 1));
                int responseInt = ifScanner.nextInt();
                while (responseInt < 0 || responseInt > studentStorage[StudentSelector].getNumCoursesTaken()) {
                    System.out.println("Enter valid number");
                    responseInt = ifScanner.nextInt(studentStorage[StudentSelector].getNumCoursesTaken());
                }

                System.out.println(studentStorage[StudentSelector].getCourseTakenAsString(responseInt));
                printMenu();
                response = ifScanner.next();
            }

            // *Case K */
            if (response.equalsIgnoreCase("K")) {
                int facultySelector = 0;
                int outTracker = 0;
                System.out.println("Which faculty object course do you want to see?");
                for (i = 0; i < facultyStorage.length; i++) {
                    if (facultyStorage[i] != null) {

                        System.out.println(i + " " + facultyStorage[i].toString());
                        outTracker++;
                    }
                }

                facultySelector = ifScanner.nextInt();

                while (facultySelector < 0 || facultySelector >= outTracker) {
                    System.out.println("Invalid index, enter a proper one");
                    facultySelector = ifScanner.nextInt();
                }

                System.out.println("Select the course object you want to query");
                int courseSelector = 0;
                int courseOutTracker = 0;
                for (i = 0; i < courseStorage.length; i++) {
                    if (courseStorage[i] != null) {

                        System.out.println(i + " " + courseStorage[i].toString());
                        courseOutTracker++;
                    }
                }

                courseSelector = ifScanner.nextInt();

                while (courseSelector < 0 || courseSelector >= courseOutTracker) {
                    System.out.println("Invalid index, enter a proper one");
                    courseSelector = ifScanner.nextInt();
                }

                boolean teachesCourse = false;
                for (int f = 0; f < facultyStorage[facultySelector].getNumCoursesTaught(); f++) {
                    if (courseStorage[courseSelector].equals(facultyStorage[facultySelector].getCourseTaught(f))) {
                        teachesCourse = true;
                        break;
                    }
                }
                if (teachesCourse) {
                    System.out.println("This faculty teaches that course");
                } else {
                    System.out.println("This faculty doesn't teach that course");
                }

            }

            // *Case L */
            if (response.equalsIgnoreCase("L")) {
                Faculty mostCoursesTaught = facultyStorage[0];
                Faculty leastCoursesTaught = facultyStorage[0];

                for (int lp = 0; lp < facultyStorage.length; lp++) {
                    if (facultyStorage[lp] != null) {

                        if (facultyStorage[lp].getNumCoursesTaught() > mostCoursesTaught.getNumCoursesTaught()) {
                            mostCoursesTaught = facultyStorage[lp];
                        }

                        if (facultyStorage[lp].getNumCoursesTaught() < leastCoursesTaught.getNumCoursesTaught()) {
                            leastCoursesTaught = facultyStorage[lp];
                        }
                    }
                }
                System.out.println("The faculty with most courses taught is: " + mostCoursesTaught);
                System.out.println("The faculty with most least courses taught is: " + leastCoursesTaught);
            }

            // *Case n */
            if (response.equalsIgnoreCase("n")) {
                Course highestCourseNum = courseStorage[0];

                for (int lp = 0; lp < facultyStorage.length; lp++) {
                    if (courseStorage[lp] != null) {

                        if (courseStorage[lp].getCourseNum() > highestCourseNum.getCourseNum()) {
                            highestCourseNum = courseStorage[lp];
                        }
                    }

                }
                System.out.println("The faculty with the highest course number: " + highestCourseNum);

            }

            // *Case m */
            if (response.equalsIgnoreCase("m")) {
                Course leastCourseNum = courseStorage[0];
                for (int lp = 0; lp < facultyStorage.length; lp++) {
                    if (courseStorage[lp] != null) {

                        if (courseStorage[lp].getCourseNum() < leastCourseNum.getCourseNum()) {
                            leastCourseNum = courseStorage[lp];
                        }
                    }
                }
                System.out.println("The faculty with smallest course number: " + leastCourseNum);
            }

            // *Case O */
            if (response.equalsIgnoreCase("o")) {
                Student mostCredStud = studentStorage[0];
                Student leastCredStud = studentStorage[0];
                int mostCredits = 0;
                int numCredits = 0;
                int leastCredits = 0;
                for (int tp = 0; tp < studentStorage.length; tp++) {
                    if (studentStorage[tp] != null) {

                        Student student = studentStorage[tp];
                        for (int st = 0; st < student.getNumCoursesTaken(); st++) {
                            numCredits = student.getCourseTaken(st).getNumCredits();
                        }
                        if (numCredits > mostCredits) {
                            mostCredStud = student;
                            mostCredits = numCredits;
                        }
                        if (numCredits < leastCredits) {
                            leastCredStud = student;
                            leastCredits = numCredits;
                        }
                    }

                }
                System.out.println("The student with the most credits is: " + mostCredStud.toString());
                System.out.println("The student with the least credits is: " + leastCredStud.toString());

            }

        } while (!(response.equalsIgnoreCase("exit")));
        ifScanner.close();
        dd.close();

        // *Begin formatting updated file */

        PrintWriter outStream = null;
        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt",
                    true));
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
        for (int m = 0; m < courseStorage.length; m++) {
            if (courseStorage[m] != null) {

                courseWriter(courseStorage[m]);
            }
        }

        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt",
                    true));
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
        for (int l = 0; l < generalStaffStorage.length; l++) {
            if (generalStaffStorage[l] != null) {

                genStaffWriter(generalStaffStorage[l]);
            }
        }

        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt",
                    true));
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

        for (int s = 0; s < facultyStorage.length; s++) {
            if (facultyStorage[s] != null) {

                facultyWriter(facultyStorage[s]);
            }
        }

        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt",
                    true));
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

        for (int q = 0; q < studentStorage.length; q++) {
            if (studentStorage[q] != null) {

                studentwriter(studentStorage[q]);
            }
        }

        try {
            outStream = new PrintWriter(new FileOutputStream("SchoolDB_Updated.txt",
                    true));
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

        // *Displays updated text file to the console (which uses toString) */
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

}
// end of class
