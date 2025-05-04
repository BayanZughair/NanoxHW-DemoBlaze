package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    public static WebDriver webDriver;
    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//a[.='Home (current)']")
    private WebElement homeLabel;
    @FindBy(linkText = "Sign up")
    private WebElement signUpNavigation;
    @FindBy(id = "sign-username")
    private WebElement usernameField;
    @FindBy(id = "sign-password")
    private WebElement passwordField;
    @FindBy(xpath = "//button[.='Sign up']")
    private WebElement signupButton;

    public boolean verifyHomePage() {
        return homeLabel.isDisplayed();
    }
    public void clickSignupNavigation(){
        signUpNavigation.click();
    }
    public void inputUsernameField(String username){
        usernameField.sendKeys(username);
    }
    public void inputPasswordField(String password){
        passwordField.sendKeys(password);
    }
    public void clickSignupButton(){
        signupButton.click();
    }
}
