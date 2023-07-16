import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.io.File;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void init() {
        System.setProperty("webdriver.chrome.driver",
                new File("external_resources/chromedriver.exe").getAbsolutePath());
    }

    @BeforeMethod(alwaysRun = true)
    public void runDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
