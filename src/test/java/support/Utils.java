package support;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import static java.lang.System.in;
import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class Utils extends RunCucumberTest {

    public void esperaElementoFicarVisivel(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollParaBaixo() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void alert() {
        driver.findElement(By.id("alert")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
    }


    public void fecharAlert() {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("__disable-notifications");
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
        driver = new ChromeDriver(ops);

    }

    public void procurado() {
        WebElement elementoProcurado = driver.findElement(By.id("1"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].click", elementoProcurado);
    }

    public void utilizandoActions() {
        WebElement element= driver.findElement(By.id("1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    public void refresh() {


    }
}
