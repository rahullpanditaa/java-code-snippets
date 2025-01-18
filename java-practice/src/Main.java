import java.util.Scanner;
import java.util.Random;

public class Main {

    // the main method is needed for the program to run
    public static void main(String[] args) {

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        double number;
        number = random.nextDouble();

        boolean isHeads;
        isHeads = random.nextBoolean();

        number1 = 1 + random.nextInt(100);
        number2 = 1 + random.nextInt(100);
        number3 = 1 + random.nextInt(100);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}
