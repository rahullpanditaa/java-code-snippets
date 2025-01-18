import java.util.Scanner;

public class Main {

    // the main method is needed for the program to run
    public static void main(String[] args) {

        // Calculate the area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The rectangle's area is: " + area + " cm^2");

        scanner.close();

    }
}
