package tests;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RegistrationPage;

/**
 * for user registration
 */
public class RegistrationTests {

    @Test
    public void registrationWithEmptyFieldsTest() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.open();
        registrationPage.fillAndSubmitRegistrationForm("", "", "", "");
        Assert.assertEquals(registrationPage.getAlertText(), "bla-bla-bla");

    }

    @DataProvider(name="emptyFieldsValuesCombination")
    public static Object[][] createData() {
        return new Object[][]{
                {"", "Last", "a@d.c","P@ssword"},
                {"First", "", "a@d.c","P@ssword"},
        };
    }

    @Test
    public void registrationAllEmptyFieldsCombination(String first, String last, String email, String password){
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.open();
        registrationPage.fillAndSubmitRegistrationForm("", "", "", "");
        Assert.assertEquals(registrationPage.getAlertText(), "bla-bla-bla");
    }
}
