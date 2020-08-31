package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;

public class RealOneDictionary implements IDictionaries {

    private List<String> germanTranslations = new ArrayList<>();
    private List<String> frenchTranslations = new ArrayList<>();

    @Override
    public void initializeDatasource() {
        germanTranslations.add("Einz");
        germanTranslations.add("Zwei");
        germanTranslations.add("Drei");
        //...

        frenchTranslations.add("Un");
        frenchTranslations.add("Deux");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Quatre");
        frenchTranslations.add("Cinq");
        frenchTranslations.add("Six");
        frenchTranslations.add("Sept");
        frenchTranslations.add("Huit");
        frenchTranslations.add("Neuf");
        frenchTranslations.add("Dix");
        frenchTranslations.add("Onze");
        frenchTranslations.add("Douze");
    }

    @Override
    public String getTranslation(Integer number, Integer language) throws LanguageNotSupportedException, NumberOutOfRangeException {
        if (language == 1) {
            return frenchTranslations.get(number - 1);
        } else if (language == 2) {
            return germanTranslations.get(number - 1);
        } else {
            throw new LanguageNotSupportedException();
        }
    }

    @Override
    public boolean isInitialized() {
        return frenchTranslations.size()==30 && germanTranslations.size()==30;
    }


}
