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

    @FindBy(xpath = "//span[@class='title']")
    private WebElement textValidationMenuPage;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement dropdownMenu;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement buttonCart;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement buttonHamburger;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    private WebElement TextItem1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement buttonAddToCartItem1;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement buttonRemoveItem1;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bike Light']")
    private WebElement textItem2;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement buttonAddToCartItem2;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    private WebElement buttonRemoveItem2;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
    private WebElement textItem3;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement buttonAddToCartItem3;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
    private WebElement buttonRemoveItem3;

    @FindBy(xpath = "//button[@id='continue-shopping']")
    private WebElement buttonBackToProducts;

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

    public void clicktext()
    {
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textValidationMenuPage)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol burger Tidak Ditemukan !!");
        }
    }

    public void clickitem()
    {
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(buttonAddToCartItem1)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol burger Tidak Ditemukan !!");
        }
    }

    public void clickButtonHamburger()
    {
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(buttonHamburger)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol burger Tidak Ditemukan !!");
        }
    }

////    public void clickButtonHamburger()
////    {
////        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
////                .until(ExpectedConditions.visibilityOf(buttonHamburger)).click();
////    }
//
    public void clickButtonlogout()
    {
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(buttonLogout)).click();
    }

//    public void clickButtonCart()
//    {
//        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
//                .until(ExpectedConditions.visibilityOf(buttonCart)).click();
//    }

}
