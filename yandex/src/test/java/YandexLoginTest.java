import org.itstep.uitest.product.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
public class YandexLoginTest extends BaseTest {

    @Test(groups = "Regression",
            testName = "Login test negative",
            description = "Verification of positive and negative authorization on the site")
    public void test1() {
        LoginPage errorPage = new LoginPage(driver)
                .open()
                .typeLogin("Test")
                .clickEnterButton()
                .typePassword("123456789")
                .clickEnterButton2();

        List<WebElement> sign_inButton = driver.findElements(By.xpath("//*[@data-t='button:action:passp:sign-in']"));
        Assert.assertTrue(sign_inButton.size() > 0, "Verify that login button is displayed");
    }
    @Test(groups = "Regression",
            testName = "Login test negative2",
            description = "Verification of positive and negative authorization on the site")
    public void test2() {
        LoginPage errorPage = new LoginPage(driver)
                .open()
                .typeLogin("Test2")
                .clickEnterButton()
                .typePassword("987654321")
                .clickEnterButton2();

        List<WebElement> sign_inButton = driver.findElements(By.xpath("//*[@data-t='button:action:passp:sign-in']"));
        Assert.assertTrue(sign_inButton.size() > 0, "Verify that login button is displayed");
    }
    @Test(groups = "Regression",
            testName = "Login test positive",
            description = "Verification of positive and negative authorization on the site")
    public void test3() {
        LoginPage errorPage = new LoginPage(driver)
                .open()
                .typeLogin("tester.itstep")
                .clickEnterButton()
                .typePassword("TesterAQA31")
                .clickEnterButton2();

        List<WebElement> avaPict = driver.findElements(By.xpath("//*[@class='UserID-Avatar-Image']"));
        Assert.assertTrue(avaPict.size() > 0, "Make sure that the user's avatar is displayed");
    }

}
