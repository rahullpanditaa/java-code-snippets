import java.util.Scanner;


public class Main {

    // the main method is needed for the program to run
    public static void main(String[] args) {

        String name = "              Michael Scott               ";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("h");
        int lastIndex = name.lastIndexOf("t");

//        name = name.toUpperCase();
//        name = name.toLowerCase();

        // trim leading and trailing whitespace
        name = name.trim();
//        name.isEmpty();

        System.out.println(name);

    }
}
