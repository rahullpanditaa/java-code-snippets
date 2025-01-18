import java.util.Scanner;


public class Main {

    // the main method is needed for the program to run
    public static void main(String[] args) {

        // enhanced switch = replacement to many else if statements

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        String day = scanner.nextLine();

        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
//            case "Tuesday" -> System.out.println("Weekday");
//            case "Wednesday" -> System.out.println("Weekday");
//            case "Thursday" -> System.out.println("Weekday");
//            case "Friday" -> System.out.println("Weekday");
//            case "Saturday" -> System.out.println("Weekend");
//            case "Sunday" -> System.out.println("Weekend");
            default -> System.out.println(day + " is not a day.");
        }

    }
}
