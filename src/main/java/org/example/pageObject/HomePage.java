package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public static WebDriver webDriver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//a[.='Phones']")
    private WebElement phoneCategories;

    public boolean verifyWelcomeUsername(String username) {
        String welcomeLocator = "//*[@id='nameofuser' and contains(text(), '" + username + "')]";
        return webDriver.findElement(By.xpath(welcomeLocator)).isDisplayed();
    }

    public void clickPhoneCategories(){
        phoneCategories.click();
    }
    public void clickProductName(String productName){
        String locatorProductName = "//a[.='" + productName + "']";
        webDriver.findElement(By.xpath(locatorProductName)).click();
    }
}
