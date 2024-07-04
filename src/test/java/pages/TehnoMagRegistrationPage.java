package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TehnoMagRegistrationPage extends BasePage {

    Actions actions = new Actions(driver);

    public TehnoMagRegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".logo")
    WebElement logo;

    @FindBy(css = ".btn-profile-signup")
    WebElement registrationLink;

    @FindBy(css = ".a-title")
    WebElement title;

    @FindBy(css = "#field-email")
    WebElement emailField;

    @FindBy(css = "#field-password")
    WebElement passwordField;

    @FindBy(css = "#field-password_confirm")
    WebElement passwordRepeatField;

    @FindBy(css = "#field-first_name")
    WebElement firstNameField;

    @FindBy(css = "#field-last_name")
    WebElement lastNameField;

    @FindBy(css = ".label-newsletter")
    WebElement newsLetterCheckbox;

    @FindBy(css = ".label-accept_terms")
    WebElement acceptTermsCheckbox;

    @FindBy(css = ".btn-signup")
    WebElement registerButton;

    public void checkLogoIsDisplayed() {
        assertTrueDisplayed(logo, "Logo displayed!");
    }

    public void clickOnRegistrationLink() throws Exception {
        click(registrationLink, "Registration link!");
    }

    public void checkTitle() {
        assertEQ(title.getText(), "Registracija", "Title!");
    }

    public void enterEmail() throws Exception {
        typeText(emailField, "tester8@yopmail.com", "Email field!");
    }

    public void enterPassword() throws Exception {
        typeText(passwordField, "Tester008", "Password field!");
    }

    public void repeatPassword() throws Exception {
        typeText(passwordRepeatField, "Tester008", "Password repeat field!");
    }

    public void enterFirstName() throws Exception {
        typeText(firstNameField, "Tester", "First name field!");
    }

    public void enterLastName() throws Exception {
        typeText(lastNameField, "Testerovic", "Last name field!");
    }

    public void clickOnNewsLetterCheckBox() throws Exception {
        click(newsLetterCheckbox, "Newsletter !");
    }

    public void clickOnAcceptTermsCheckbox() throws Exception {
        actions.moveToElement(acceptTermsCheckbox).build().perform();
    }

    public void clickOnRegisterButton() throws Exception {
        click(registerButton, "Register button!");
    }
}
