package org.itstep.uitest.product.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage {
    private static final String URL = "https://passport.yandex.by";
    private static final String LOGIN_INPUT_XPATH_LOCATOR = "//*[@name='login']";
    private static final String SIGNIN_BUTTON_XPATH_LOCATOR = "//*[@data-t='button:action:passp:sign-in']";
    private static final String PASSWORD_INPUT_XPATH_LOCATOR = "//*[@data-t='field:input-passwd']";
    private static final String AVATAR_PICTURE_XPATH_LOCATOR = "//*[@class='UserID-Avatar-Image']";
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage open() {
        driver.get(URL);
        return new LoginPage(driver);
    }
    public LoginPage typeLogin(String username) {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(LOGIN_INPUT_XPATH_LOCATOR))
        ).sendKeys(username);
        driver.switchTo().defaultContent();
        return new LoginPage(driver);
    }
    public LoginPage clickEnterButton() {
        wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath(SIGNIN_BUTTON_XPATH_LOCATOR))
        ).click();
        return new LoginPage(driver);
    }
    public LoginPage typePassword(String password) {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(PASSWORD_INPUT_XPATH_LOCATOR))
        ).sendKeys(password);
        driver.switchTo().defaultContent();
        return new LoginPage(driver);
    }
    public LoginPage clickEnterButton2() {
        wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath(SIGNIN_BUTTON_XPATH_LOCATOR))
        ).click();
       return new LoginPage(driver);
    }
    public LoginPage displayedAvaPict() {
       wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath(AVATAR_PICTURE_XPATH_LOCATOR))
        );
        return new LoginPage(driver);
    }
}
