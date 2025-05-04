package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public static WebDriver webDriver;

    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//div[@class='product-content product-wrap clearfix product-deatil']")
    private WebElement productPage;
    @FindBy(css = "a.btn.btn-success.btn-lg[onclick='addToCart(2)']")
    private WebElement addCartButton;

    public boolean verifyProductPage(){
        return productPage.isDisplayed();
    }

    public void clickAddCartButton(){
        addCartButton.click();
    }
}
