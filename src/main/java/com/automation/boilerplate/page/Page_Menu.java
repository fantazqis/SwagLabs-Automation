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

public class Page_Menu {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='product_label']")
    private WebElement textValidationMenuPage;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement dropdownMenu;

    @FindBy(xpath = "//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']")
    private WebElement buttonCart;

    @FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//button[@class='btn_secondary btn_inventory']")
    private WebElement buttonRemoveFromCart;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    private WebElement item1;

    @FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
    private WebElement buttonAddToCartItem1;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bike Light']")
    private WebElement item2;

    @FindBy(xpath = "//div[5]//div[3]//button[1]")
    private WebElement buttonAddToCartItem2;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
    private WebElement item3;

    @FindBy(xpath = "//div[3]//div[3]//button[1]")
    private WebElement buttonAddToCartItem3;

    @FindBy(xpath = "//button[normalize-space()='Open Menu']")
    private WebElement buttonHamburger;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement buttonLogout;

    public Page_Menu(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public String getValidationMenuPage()
    {
        return (this.textValidationMenuPage == null) ? "" : new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textValidationMenuPage)).getText();
    }

    public void clickButtonHamburger()
    {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(buttonHamburger)).click();
    }

    public void clickButtonlogout()
    {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(buttonLogout)).click();
    }

    public void clickButtonCart()
    {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(buttonCart)).click();
    }

}
