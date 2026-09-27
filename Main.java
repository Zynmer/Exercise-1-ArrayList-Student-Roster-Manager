import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        students.add("Alice Johnson");
        students.add("Bob Martinez");
        students.add("Carol Smith");
        students.add("David Lee");
        students.add("Emma Davis");

        System.out.println("\nCurrent Roster: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }

        System.out.println("\nEnter the name of the student to remove: ");
        String nameRemove = scanner.nextLine();

        if (students.remove(nameRemove)) {
            System.out.println(nameRemove + " has been removed.");
        } else {
            System.out.println(nameRemove + "was not found.");
        }

        System.out.println("\nUpdated Roster: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }

        System.out.println("\nTotal Students Remaining: " + students.size());

        scanner.close();
    }
}
