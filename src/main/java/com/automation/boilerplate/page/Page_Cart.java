package com.automation.boilerplate.page;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author ASUS a.k.a. Muhammad Irfan
Java Developer
Created on 04/11/2024 13:04
@Last Modified 04/11/2024 13:04
Version 1.0
*/

import com.automation.boilerplate.connection.Constants;
import com.automation.boilerplate.connection.DriverSingleton;
import com.automation.boilerplate.util.GlobalFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page_Cart {
    WebDriver driver;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement textPageCartValidation;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement buttonRemoveItem1;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    private WebElement buttonRemoveItem2;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
    private WebElement buttonRemoveItem3;

    @FindBy(xpath = "//button[@id='continue-shopping']")
    private WebElement buttonContinueShopping;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement buttonCheckoutCart;


    @FindBy(id = "first-name")
    private WebElement textFieldCheckoutFormFirstName;

    @FindBy(id = "last-name")
    private WebElement textFieldCheckoutFormLastName;

    @FindBy(id = "postal-code")
    private WebElement textFieldCheckoutFormZipCode;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement alertFormCheckout;

    @FindBy(xpath = "//button[@class='error-button']//*[name()='svg']")
    private WebElement alertCloseFormCheckout;

    @FindBy(xpath = "//button[@id='cancel']")
    private WebElement buttonCancelCheckout;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement buttonContinueCheckout;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement buttonFinishCheckout;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement textFinishOrderValidation;

    @FindBy(xpath = "//button[@id='back-to-products']")
    private WebElement buttonBackToHomepage;


    public Page_Cart(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(this.driver,this);
    }




}
