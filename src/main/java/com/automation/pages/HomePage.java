package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utility.DriverUtils.getDriver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Sign in']")
    private WebElement signInBtn;

    @FindBy(xpath = "//*[@alt=\"eBay Logo\"]")
    private WebElement logoImg;
}
