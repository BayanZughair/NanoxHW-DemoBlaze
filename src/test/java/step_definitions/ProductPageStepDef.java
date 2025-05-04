package step_definitions;

import common.driver.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class ProductPageStepDef {
    private final WebDriver driver = DriverManager.getDriver();
    ProductPage productPage = new ProductPage(driver);
    LoginPage loginPage  = new LoginPage(driver);

    @Then("User will be redirected to the product page")
    public void userWillBeRedirectedToProductPage() {
        Assert.assertTrue(productPage.verifyProductPage());
    }

    @When("User click on add to cart button")
    public void userClickOnAddToCartButton() throws InterruptedException {
        productPage.clickAddCartButton();
        Thread.sleep(5000);
    }

    @Then("The product has been added to cart and user should see pop up with this message {string}")
    public void theProductHasBeenAddedToCartAndUserShouldSeePopUpWithThisMessage(String alertText) {
        String expectedAlertText = loginPage.alertMessage();
        assertEquals(expectedAlertText, alertText);
    }
}
