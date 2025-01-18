import java.util.Scanner;


public class Main {

    // the main method is needed for the program to run
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 320.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a 10% student discount.");
                System.out.println("You get a 20% senior discount.");
                price *= 0.7;

            } else {
                System.out.println("You get a 10% student discount.");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You get a 20% senior discount.");
                price *= 0.8;
            }
        }

        System.out.printf("Price of ticket: ₹%.3f\n", price);
    }
}
