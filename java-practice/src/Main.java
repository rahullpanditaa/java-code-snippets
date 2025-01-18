import java.util.Arrays;
import java.util.Scanner;


public class Main {

    // the main method is needed for the program to run
    public static void main(String[] args) {

        // array = collection of values of the same data type
        String[] fruits = {"apple", "orange", "grapes"};

//        fruits[0] = "banana";

//        int numOfFruits = fruits.length;

//        System.out.println(fruits[0]);
//        Arrays.sort(fruits);
        Arrays.fill(fruits, "strawberry");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i]);
//        }

    }
}
