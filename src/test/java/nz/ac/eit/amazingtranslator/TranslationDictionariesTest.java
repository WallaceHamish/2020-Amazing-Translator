package nz.ac.eit.amazingtranslator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TranslationDictionariesTest {

    private TranslationDictionaries dictionaries;

    @Before
    public void setup(){
        dictionaries=new TranslationDictionaries();
        dictionaries.setDictionaries(new StubDictionary());
    }

    @Test
    public void getTranslation_12InFrench_Douze(){

        dictionaries.initializeDictionaries();
        try {
            Assert.assertEquals("12 in French should have returned Douze", "Douze", dictionaries.getTranslation(12,1));
        } catch (LanguageNotSupportedException e) {
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            Assert.fail("12 does not have any translation available");
        }
    }

    @Test
    public void getTranslationOf_12WithUnsupportedLanguage_throwsLanguageNotSupportedException(){

        dictionaries.initializeDictionaries();
        try {
            Assert.assertEquals("12 in French should have returned Douze", "Douze", dictionaries.getTranslation(12,4));
            Assert.fail("It should fail with an unsupported language");
        } catch (LanguageNotSupportedException e) {

        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            Assert.fail("12 does not have any translation available");
        }
    }

    @Test(expected = LanguageNotSupportedException.class)
    public void getTranslationOf_12WithUnsupportedLanguage_throwsLanguageNotSupportedException_moreAccurate() throws LanguageNotSupportedException{

        dictionaries.initializeDictionaries();
        try {
            Assert.assertEquals("12 in French should have returned Douze", "Douze", dictionaries.getTranslation(12,4));
            Assert.fail("It should fail with an unsupported language");
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            Assert.fail("12 does not have any translation available");
        }
    }


}
