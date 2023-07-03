package uitest;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class YandexLoginTest3 extends BaseTest {

    @Test(groups = "Regression",
            testName = "Login test positive",
            description = "Verification of positive and negative authorization on the site")
    public void test3() {
        driver.get("https://passport.yandex.by");
        waitFor(2);
        WebElement loginInput = driver.findElement(By.xpath("//*[@name='login']"));
        loginInput.sendKeys("tester.itstep");
        driver.switchTo().defaultContent();

        waitFor(2);
        WebElement signinButton = driver.findElement(By.xpath("//*[@data-t='button:action:passp:sign-in']"));
        signinButton.click();
        driver.switchTo().defaultContent();

        waitFor(2);
        WebElement passInput = driver.findElement(By.xpath("//*[@data-t='field:input-passwd']"));
        passInput.sendKeys("TesterAQA31");
        driver.switchTo().defaultContent();

        waitFor(2);
        signinButton = driver.findElement(By.xpath("//*[@data-t='button:action:passp:sign-in']"));
        signinButton.click();
        driver.switchTo().defaultContent();

        waitFor(2);
        List<WebElement> avaPict = driver.findElements(By.xpath("//*[@class='UserID-Avatar ']"));
        Assert.assertTrue(avaPict.size() > 0, "Make sure that the user's avatar is displayed");
    }
    @SneakyThrows
    public void waitFor(int seconds) {
        Thread.sleep(seconds * 1_000);
    }

}