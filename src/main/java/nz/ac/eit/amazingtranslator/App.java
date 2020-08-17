package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args)
    {
        System.out.println("What is the number to translate?");
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();

        Integer number = null;
        try {
            number = Integer.parseInt(numberAsString);
            System.out.println(number);
        } catch (NumberFormatException nfe) {
            System.out.println("The number has to be numeric");
            System.exit(0);
        }

    }
}

