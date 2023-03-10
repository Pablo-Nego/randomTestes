package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        //json:target/reports/cucumber.json", "html:target/reports/
        plugin = {},
        features = "src/test/resources/features",
        tags = {},
        glue = {"steps"}
)
public class RunCucumberTest {
    public static WebDriver driver;

    @BeforeClass
    public static void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("chrome://settings/clearBrowserData");
        driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void stop() {
        driver.quit();
    }
}
