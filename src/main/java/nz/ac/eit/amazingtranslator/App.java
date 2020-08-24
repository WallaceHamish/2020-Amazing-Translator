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
        TranslationDictionaries dictionaries=new TranslationDictionaries();
        dictionaries.initializeDictionaries();

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

        System.out.println("What is the language? (1-French, 2-German)");
        String optionAsString = scanner.nextLine();

        Integer option = null;
        try {
            option = Integer.parseInt(optionAsString);
            System.out.println(option);
        } catch (NumberFormatException nfe) {
            System.out.println("The option has to be numeric");
            System.exit(0);
        }

        //Check that the option is 1 or 2

        try {
            String translated = dictionaries.getTranslation(number - 1,option);
            System.out.println(translated);
        } catch (LanguageNotSupportedException lnse){
            System.out.println("Language not supported");
        } catch (NumberOutOfRangeException noore) {
            System.out.println("Numbers have to be between 1 and 30 included");
        }

    }
}

