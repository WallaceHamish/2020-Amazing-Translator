package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;

public class TranslationDictionaries {

    private IDictionaries dictionaries;

    public boolean initializeDictionaries() {

        dictionaries.initializeDatasource();
        //...

        return dictionaries.isInitialized();
    }

    public String getTranslation(Integer number, Integer language) throws LanguageNotSupportedException, NumberOutOfRangeException {

        return dictionaries.getTranslation(number,language);

    }

    public void setDictionaries(IDictionaries dictionaries) {
        this.dictionaries = dictionaries;
    }
}
