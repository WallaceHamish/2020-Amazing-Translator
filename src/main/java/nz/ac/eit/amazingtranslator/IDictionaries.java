package nz.ac.eit.amazingtranslator;

public interface IDictionaries {

    void initializeDatasource();
    String getTranslation(Integer number, Integer language) throws LanguageNotSupportedException, NumberOutOfRangeException;
    boolean isInitialized();

}
