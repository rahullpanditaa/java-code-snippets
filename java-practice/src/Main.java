import java.util.Scanner;

public class Main {

    // the main method is needed for the program to run
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        // next line method of scanner object reads
        // a string of characters
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age + " years.");

        System.out.print("What is your weight (in kgs)? : ");
        double weight = scanner.nextDouble();
        System.out.println(weight + " kgs.");

        if (weight > 65.0) {
            System.out.println("Go to the gym.");
        } else {
            System.out.println("Kuposhan hai aapko.");
        }


        scanner.close();

    }
}
