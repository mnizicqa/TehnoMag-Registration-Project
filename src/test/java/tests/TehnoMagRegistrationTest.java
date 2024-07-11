package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.TehnoMagRegistrationPage;

public class TehnoMagRegistrationTest extends BaseTest {

    @BeforeMethod
    @Parameters({"browser", "wait", "env"})
    public void setup(String browser, String wait, String env) throws Exception {
        init(browser, wait);
        openApp(env);
    }

    @AfterMethod
    @Parameters({"quit"})
    public void tearDown(String quit) {
        if(quit.equalsIgnoreCase("yes")) {
            quit();
        }
    }

    @Test
    public void TehnoMagRegistration() throws Exception {
        TehnoMagRegistrationPage tehnoMagRegistrationPage = new TehnoMagRegistrationPage(driver);
        tehnoMagRegistrationPage.checkLogoIsDisplayed();
        tehnoMagRegistrationPage.clickOnRegistrationLink();
        tehnoMagRegistrationPage.enterEmail();
        tehnoMagRegistrationPage.enterPassword();
        tehnoMagRegistrationPage.repeatPassword();
        tehnoMagRegistrationPage.enterFirstName();
        tehnoMagRegistrationPage.enterLastName();
        tehnoMagRegistrationPage.clickOnNewsLetterCheckBox();
        tehnoMagRegistrationPage.clickOnAcceptTermsCheckbox();
        tehnoMagRegistrationPage.clickOnRegisterButton();
    }
}
