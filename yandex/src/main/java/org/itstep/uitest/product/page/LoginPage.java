package org.itstep.uitest.product.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {
    private static final String URL = "https://passport.yandex.by";
    private static final String LOGIN_INPUT_XPATH_LOCATOR = "//*[@name='login']";
    private static final String SIGNIN_BUTTON_XPATH_LOCATOR = "//*[@data-t='button:action:passp:sign-in']";
    private static final String PASSWORD_INPUT_XPATH_LOCATOR = "//*[@data-t='field:input-passwd']";
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage open() {
        driver.get(URL);
        return new LoginPage(driver);
    }
    public LoginPage typeLogin(String username) {
        waitFor(2);
        WebElement loginInput = driver.findElement(By.xpath(LOGIN_INPUT_XPATH_LOCATOR));
        loginInput.sendKeys(username);
        driver.switchTo().defaultContent();
        return new LoginPage(driver);
    }
    public LoginPage clickEnterButton() {
        WebElement enterButton = driver.findElement(By.xpath(SIGNIN_BUTTON_XPATH_LOCATOR));
        enterButton.click();
        return new LoginPage(driver);
    }
    public LoginPage typePassword(String password) {
        waitFor(2);
        WebElement passwordInput = driver.findElement(By.xpath(PASSWORD_INPUT_XPATH_LOCATOR));
        passwordInput.sendKeys(password);
        driver.switchTo().defaultContent();
        return new LoginPage(driver);
    }
    public LoginPage clickEnterButton2() {
        WebElement enterButton = driver.findElement(By.xpath(SIGNIN_BUTTON_XPATH_LOCATOR));
        enterButton.click();
        waitFor(2);
        return new LoginPage(driver);
    }
}
