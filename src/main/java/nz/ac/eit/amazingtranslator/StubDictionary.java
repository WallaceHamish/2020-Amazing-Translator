package nz.ac.eit.amazingtranslator;

public class StubDictionary implements IDictionaries{

    @Override
    public void initializeDatasource() {
    }

    @Override
    public String getTranslation(Integer number, Integer language) throws LanguageNotSupportedException, NumberOutOfRangeException {

        if (language == 1) {
            switch (number) {
                case 1:
                    return "Un";
                case 2:
                    return "Deux";
                case 12:
                    return "Douze";
                default:
                    throw new NumberOutOfRangeException();
            }
        } else if (language == 2) {
            switch (number) {
                case 1:
                    return "Einz";
                case 2:
                    return "Zwei";
                default:
                    throw new NumberOutOfRangeException();
            }
        } else throw new LanguageNotSupportedException();
    }

    @Override
    public boolean isInitialized() {
        return true;
    }
}
