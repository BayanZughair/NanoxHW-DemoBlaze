package step_definitions;

import common.driver.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class CartPageStepDef {
    private final WebDriver driver = DriverManager.getDriver();
    CartPage cartPage  = new CartPage(driver);
    LoginPage loginPage = new LoginPage(driver);


    @Then("User should be redirected to cart page")
    public void userShouldBeRedirectedToCartPage() throws InterruptedException {
        Assert.assertTrue(cartPage.verifyCartPage());
        Thread.sleep(5000);
    }

    @When("User click on delete button")
    public void userClickOnDeleteButton() throws InterruptedException {
        cartPage.clickDeleteButton();
        Thread.sleep(5000);
    }

    @When("User click on Place Order button")
    public void userClickOnPlaceOrderButton() throws InterruptedException {
        cartPage.clickPlaceOrderButton();
        Thread.sleep(3000);
    }

    @Then("User should see purchase form")
    public void userShouldSeePurchaseForm() {
        Assert.assertTrue(cartPage.verifyPurchaseForm());
    }

    @Then("User click on the cart button in navigation bar")
    public void userClickOnTheCartButtonInNavigationBar() throws InterruptedException {
        cartPage.clickCartNavigation();
        Thread.sleep(5000);
    }

}
