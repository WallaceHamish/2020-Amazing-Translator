package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;

public class TranslationDictionaries {

    private List<String> germanTranslations = new ArrayList<>();
    private List<String> frenchTranslations = new ArrayList<>();

    public Integer initializeDictionaries() {

        germanTranslations.add("Einz");
        germanTranslations.add("Zwei");
        germanTranslations.add("Drei");
        //...

        frenchTranslations.add("Un");
        frenchTranslations.add("Deux");
        frenchTranslations.add("Trois");
        //...
        //We return the size of the translation for the purpose of testing but we don't use it
        //in the application itself

        return frenchTranslations.size();
    }

    public String getTranslation(Integer number, Integer language) throws LanguageNotSupportedException, NumberOutOfRangeException {

        if (number<1 || number>30){
            throw new NumberOutOfRangeException();
        }

        if (language == 1) {
            return frenchTranslations.get(number - 1);
        } else if (language == 2) {
            return germanTranslations.get(number - 1);
        } else {
            throw new LanguageNotSupportedException();
        }

    }
}
