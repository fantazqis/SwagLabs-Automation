package com.automation.boilerplate.impl;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author ASUS a.k.a. Muhammad Irfan
Java Developer
Created on 04/11/2024 12:51
@Last Modified 04/11/2024 12:51
Version 1.0
*/

import com.automation.boilerplate.connection.Constants;
import com.automation.boilerplate.page.PageBoilerplate;
import com.automation.boilerplate.page.Page_Login;
import com.automation.boilerplate.page.Page_Menu;
import com.automation.boilerplate.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TC_001_Login_Function {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private PageBoilerplate pageBoilerplate;
    private Page_Login page_login;
    private Page_Menu page_menu;


    public TC_001_Login_Function(){
        this.driver = TestHooks.driver;
        page_login = new Page_Login(driver);
        page_menu = new Page_Menu(driver);
        extentTest = TestHooks.extentTest;

    }

    @When("TS001 Membuka Halaman Web")
    public void ts_001_membuka_halaman_web() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        driver.get(Constants.WEB_URL);
        System.out.println("1");
        extentTest.log(LogStatus.PASS, "TS001 Membuka Halaman Login");
    }

    @And("TS001 Validasi Halaman Login")
    public void ts_001_validasi_halaman_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validation = page_login.getValidationLoginPage();
        Assert.assertEquals(validation, "Swag Labs");
        System.out.println("1");
        extentTest.log(LogStatus.PASS, "TS001 Validasi Halaman Login");
    }

    @And("^TS001 Input Username (.*)$")
    public void ts_001_input_username_username(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        page_login.clearLoginForm();
        page_login.inputUsername(username);
        System.out.println("2");
        extentTest.log(LogStatus.PASS, "TS001 Input Username " + username);
}

    @And("^TS001 Input Password (.*)$")
    public void ts_001_input_password_password(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        page_login.inputPassword(password);
        System.out.println("3");
        extentTest.log(LogStatus.PASS, "TS001 Input Password " + password);
}

    @And("TS001 Klik Tombol Login")
    public void ts_001_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        page_login.clickButtonLogin();
        System.out.println("4");
        extentTest.log(LogStatus.PASS, "TS001 Klik Tombol Login");
    }

    @Then("TS001 Validasi Halaman Menu")
    public void ts_001_validasi_halaman_menu() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validation = page_menu.getValidationMenuPage();
        Assert.assertEquals(validation, "Products");
        System.out.println("validasi: "+validation);

        System.out.println("selesai 5");
        extentTest.log(LogStatus.PASS, "TS001 Validasi Halaman Menu");
    }

    @When("TS001 Klik Tombol Hamburger")
    public void ts_001_klik_tombol_hamburger() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        page_menu.clicktext();
        page_menu.clickitem();
        System.out.println("masuk 6");
        page_menu.clickButtonHamburger();
        System.out.println("6");
        extentTest.log(LogStatus.PASS, "TS001 Klik Tombol Hamburger");
    }

    @And("TS001 Klik Logout")
    public void ts_001_klik_logout() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(1);
        page_menu.clickButtonlogout();
        System.out.println("7");
        extentTest.log(LogStatus.PASS, "TS001 Klik Logout");
    }

    @Then("TS001 Validasi Kembali Ke Halaman Login")
    public void ts_001_validasi_kembali_ke_halaman_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validation = page_login.getValidationLoginPage();
        Assert.assertEquals(validation, "Swag Labs");
        System.out.println("8");
        extentTest.log(LogStatus.PASS, "TS001 Validasi Kembali Ke Halaman Login");
    }

}
