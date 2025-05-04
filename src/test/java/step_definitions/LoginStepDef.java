package step_definitions;

import common.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LoginStepDef {
    private final WebDriver driver = DriverManager.getDriver();
    LoginPage loginPage  = new LoginPage(driver);
    HomePage homePage  = new HomePage(driver);

    @When("User click login in button in home page")
    public void userClickLoginInButtonInHomePage() throws InterruptedException {
        loginPage.clickLoginNavigation();
        Thread.sleep(2000);
    }

    @And("User input {string} in username field in login page")
    public void userInputInUsernameFieldInLoginPage(String username) {
        loginPage.inputUsernameField(username);
    }

    @And("User input {string} in password field in login page")
    public void userInputInPasswordFieldInLoginPage(String password) {
        loginPage.inputPasswordField(password);
    }

    @And("User click login button")
    public void userClickLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(5000);
    }

    @Then("User successfully logged in and should see Welcome {string} label at the navigation bar")
    public void userSuccessfullyLoggedInAndShouldSeeWelcomeLabelAtTheNavigationBar(String username) {
        Assert.assertTrue(homePage.verifyWelcomeUsername(username));
    }

    @Then("User failed to login and should see pop up with this message {string}")
    public void userFailedToLoginAndShouldSeePopUpWithThisMessage(String alertText) {
        String expectedAlertText = loginPage.alertMessage();
        assertEquals(expectedAlertText, alertText);
    }
}
