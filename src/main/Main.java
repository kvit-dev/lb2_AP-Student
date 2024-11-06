import java.time.LocalDate;
import java.util.Scanner;

/**
 * Main class which represents the actions with Students
 * It also allows the user to choose from various options
 */
public class Main {
    public static void main(String[] args) {
        Student[] arr;
        arr = new Student[5];

        arr[0] = new Student(1, "Schevchuk", "Ana", "Volodymyrivna", LocalDate.of(2004, 8, 15), "Volyova 58", "0985471250", "Economics", 3, "EA-33");
        arr[1] = new Student(2, "Koval", "Olena", "Olehivna", LocalDate.of(2004, 8, 10), "Vilasa 20", "0678549520", "Law", 2, "UR-21");
        arr[2] = new Student(3, "Savchuk", "Ira", "Volodymyrivna", LocalDate.of(2005, 2, 5), "Mriyi 5", "0679641025", "Computer Science", 2, "CS-24");
        arr[3] = new Student(4, "Rovko", "Oleh", "Ostapovych", LocalDate.of(2004, 4, 4), "Ivy 1", "0987452003", "Economics", 3, "EA-33");
        arr[4] = new Student(5, "Antonyuk", "Kateryna", "Tarasivna", LocalDate.of(2006, 1, 2), "Chuprynky 203", "0685423651", "Geological", 2, "GS-102");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose one: ");
            System.out.println("1. Display the list of students of the given faculty");
            System.out.println("2. Display the list of students born after the given year");
            System.out.println("3. Display the list of the list of study groups");
            System.out.println("4. Exit");

            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.print("Enter faculty: ");
                    String faculty = scanner.nextLine();
                    ListByFaculty(arr, faculty);
                    break;
                case 2:
                    System.out.print("Enter year: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    ListByYear(arr, year);
                    break;
                case 3:
                    System.out.print("Enter group: ");
                    String group = scanner.nextLine();
                    ListByGroup(arr, group);
                    break;
                case 4:
                    System.out.print("Exiting");
                    scanner.close();
                    return;
                default:
                    System.out.println("Try again!");
            }
        }
    }

    /**
     * Displays the list of students of the given faculty
     * @param students  An array
     * @param faculty   Faculty
     */
    public static void ListByFaculty (Student[] students, String faculty) {
        boolean found = false;
        for (Student student : students) {
            if (student.getFaculty().equalsIgnoreCase(faculty)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students with this faculty were found");
        }
    }

    /**
     * Display the list of students born after the given year
     * @param students  An array
     * @param year      Year
     */
    public static void ListByYear (Student[] students, int year) {
        boolean found = false;
        for (Student student : students) {
            if (student.getDateOfBirth().getYear() > year) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students born after this were found");
        }
    }

    /**
     * Display the list of the list of study groups
     * @param students  An array
     * @param group     Group
     */
    public static void ListByGroup (Student[] students, String group) {
        boolean found = false;
        for (Student student : students) {
            if (student.getGroup().equalsIgnoreCase(group)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students were found");
        }
    }
}