import java.util.Scanner;

public class Main {

    // the main method is needed for the program to run
    public static void main(String[] args) {

        // opens the input stream I guess?
        // otherwise console is read only
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's date: ");
        int date = scanner.nextInt();
        // get rid of newline character
        scanner.nextLine();

        System.out.print("Enter today's day: ");
        String day = scanner.nextLine();

        System.out.println("Today's date: " + date);
        System.out.println("Today's day: " + day);

        scanner.close();

    }
}
