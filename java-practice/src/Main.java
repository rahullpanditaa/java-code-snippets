import java.util.Scanner;


public class Main {

    // the main method is needed for the program to run
    public static void main(String[] args) {

//        System.out.println(Math.PI);
//        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 3);
        System.out.println(result);

        result = Math.abs(-99);
        System.out.println(result);

        result = Math.sqrt(69);
        System.out.println(result);

        result = Math.round(3.14);
        System.out.println(result);  // 3.0

        result = Math.ceil(3.14);
        System.out.println(result); // 4.0

        result = Math.floor(3.99);
        System.out.println(result); // 3.0

        result = Math.max(10, 20);
        System.out.println(result);

        result = Math.min(23, 2);
        System.out.println(result);
    }
}
