package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utility.DriverUtils.getDriver;

public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(getDriver(), this);

    }


    @FindBy(id="userid")
    private WebElement userIdTxtField;

    @FindBy(id="pass")
    private WebElement userpassword;

    @FindBy(id="sgnBt")
    private WebElement signButton;


    public void login() {
        userIdTxtField.sendKeys("test@test.com");
        userpassword.sendKeys("Test");
        signButton.click();
    }




}
