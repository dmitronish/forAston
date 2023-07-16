package org.itstep.uitest.product.page;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
public abstract class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
     @SneakyThrows
    protected void waitFor(int seconds) {
        Thread.sleep(seconds * 1_000);
    }
}
