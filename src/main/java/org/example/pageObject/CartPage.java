package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver webDriver;
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(css = "a[href='cart.html']")
    private WebElement cartNavigation;

    @FindBy(xpath = "//h2[normalize-space()='Products']")
    private WebElement cartPage;

    @FindBy(xpath = "//a[text()='Delete']")
    private WebElement deleteButton; // consider using a List<WebElement> if there are multiple

    @FindBy(css = "#tbodyid td:nth-child(2)")
    private WebElement productNameList; // or List<WebElement> for multiple rows

    @FindBy(xpath = "//button[text()='Place Order']")
    private WebElement placeOrderButton;

    @FindBy(xpath = "//label[@for='name']")
    private WebElement nameField; // improved over using className

    @FindBy(id = "country")
    private WebElement countryField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "card")
    private WebElement creditCardField;

    @FindBy(id = "month")
    private WebElement monthField;

    @FindBy(id = "year")
    private WebElement yearField;

    @FindBy(xpath = "//button[text()='Purchase']")
    private WebElement purchaseButton;

    @FindBy(xpath = "//h2[text()='Thank you for your purchase!']")
    private WebElement thankYouNotification;

    public void clickCartNavigation(){
        cartNavigation.click();
    }
    public boolean verifyCartPage(){
        return cartPage.isDisplayed();
    }

    public void clickDeleteButton(){
        deleteButton.click();
    }
    public boolean verifyProductNameList() {
        return productNameList.isDisplayed();
    }
    public void clickPlaceOrderButton(){
        placeOrderButton.click();
    }
    public boolean verifyPurchaseForm() {
        return nameField.isDisplayed();
    }
}
