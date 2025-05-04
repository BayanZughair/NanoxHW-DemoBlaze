package step_definitions;

import common.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageStepDef {
    private final WebDriver driver = DriverManager.getDriver();
    HomePage homePage  = new HomePage(driver);

    @When("User click on phones button in categories")
    public void userClickOnPhonesButtonInCategories() throws InterruptedException {
        homePage.clickPhoneCategories();
        Thread.sleep(1000);
    }

    @And("User click on {string}")
    public void userClickOn(String productName) throws InterruptedException {
        homePage.clickProductName(productName);
        Thread.sleep(5000);
    }
}
