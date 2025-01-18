import java.util.Scanner;


public class Main {

    // the main method is needed for the program to run
    public static void main(String[] args) {

        // printf() - method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Lulu";
        char firstLetter = 'L';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n" ,name);
        System.out.printf("Name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);


    }
}
