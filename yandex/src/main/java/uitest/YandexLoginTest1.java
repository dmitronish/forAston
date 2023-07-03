package uitest;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class YandexLoginTest1 extends BaseTest {

    @Test(groups = "Regression",
            testName = "Login test negative",
            description = "Verification of positive and negative authorization on the site")
    public void test1() {
        driver.get("https://passport.yandex.by");
        waitFor(2);
        WebElement loginInput = driver.findElement(By.xpath("//*[@name='login']"));
        loginInput.sendKeys("Test");
        driver.switchTo().defaultContent();

        waitFor(2);
        WebElement signinButton = driver.findElement(By.xpath("//*[@data-t='button:action:passp:sign-in']"));
        signinButton.click();
        driver.switchTo().defaultContent();

        waitFor(2);
        WebElement passInput = driver.findElement(By.xpath("//*[@data-t='field:input-passwd']"));
        passInput.sendKeys("123456789");
        driver.switchTo().defaultContent();

        waitFor(2);
        signinButton = driver.findElement(By.xpath("//*[@data-t='button:action:passp:sign-in']"));
        signinButton.click();
        driver.switchTo().defaultContent();

        waitFor(2);
        List<WebElement> sign_inButton = driver.findElements(By.xpath("//*[@data-t='button:action:passp:sign-in']"));
        Assert.assertTrue(sign_inButton.size() > 0, "Verify that login button is displayed");
        driver.switchTo().defaultContent();
    }
    @SneakyThrows
    public void waitFor(int seconds) {
        Thread.sleep(seconds * 1_000);
    }

}
