package step_definitions;

import common.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.SignUpPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class SignUpStepDef {
    private final WebDriver driver = DriverManager.getDriver();
    SignUpPage signupPage  = new SignUpPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Given("User already on demoblaze home page")
    public void userAlreadyOnDemoblazeHomePage() {
        Assert.assertTrue(signupPage.verifyHomePage());
    }

    @When("User click sign up button in homepage")
    public void userClickSignUpButtonInHomepage() throws InterruptedException {
        signupPage.clickSignupNavigation();
        Thread.sleep(2000);
    }

    @And("User input {string} in username field")
    public void userInputInUsernameField(String username) {
        signupPage.inputUsernameField(username);
    }

    @And("User input {string} in password field")
    public void userInputInPasswordField(String password) {
        signupPage.inputPasswordField(password);
    }

    @And("User click sign up button")
    public void userClickSignUpButton() throws InterruptedException {
        signupPage.clickSignupButton();
        Thread.sleep(2000);
    }

    @Then("User should see pop up message {string}")
    public void userShouldSeePopUpMessage(String alertText) {
        String expectedAlertText = loginPage.alertMessage();
        assertEquals(expectedAlertText, alertText);
    }
}
