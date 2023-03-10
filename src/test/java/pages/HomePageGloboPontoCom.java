package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Utils;

public class HomePageGloboPontoCom extends Utils {
    WebDriverWait wait;
    WebDriver driver;


    public HomePageGloboPontoCom(WebDriver driver) {
        this.driver = driver;
    }


    public void acessarAplicacao() {

        driver.get("https://www.globo.com/");
        Assert.assertEquals("Acessou a aplicação com sucesso!", true, driver.findElement(By.xpath("(//span[contains(.,'Menu')])[1]")).isDisplayed());
    }

    public void vaiParaG1() {
        esperaElementoFicarVisivel(By.xpath("(//span[contains(.,'Menu')])[1]"), 10);
        driver.findElement(By.xpath("(//a[contains(@class,'header-title homeui-tc-jornalismo')])[2]")).click();
    }

    public void vaiParaOGlobo() {
        esperaElementoFicarVisivel(By.xpath("(//a[contains(@class,'header-title homeui-tc-oglobo')])[2]"),10);
        driver.findElement(By.xpath("(//a[contains(@class,'header-title homeui-tc-oglobo')])[2]")).click();
    }

    public void vaiParaValor() {
        esperaElementoFicarVisivel(By.xpath("//a[contains(@class,'header-title homeui-tc-valor')]"),10);
        driver.findElement(By.xpath("//a[contains(@class,'header-title homeui-tc-valor')]")).click();
    }

    public void vaiParaGE() {
        esperaElementoFicarVisivel(By.xpath("(//a[contains(@class,'header-title homeui-tc-esporte')])[2]"),10);
        driver.findElement(By.xpath("(//a[contains(@class,'header-title homeui-tc-esporte')])[2]")).click();
    }

    public void vaiParaCartola(){
    esperaElementoFicarVisivel(By.xpath("(//a[contains(@href,'cartola-2022')])[2]"),10);
    driver.findElement(By.xpath("(//a[contains(@href,'cartola-2022')])[2]")).click();
    }

    public void vaiParaGloboPlay() {
        esperaElementoFicarVisivel(By.xpath("(//a[contains(@class,'header-title homeui-tc-globoplay')])[2]"),10);
        driver.findElement(By.xpath("(//a[contains(@class,'header-title homeui-tc-globoplay')])[2]")).click();

    }

    public void vaiParaGshow(){
        esperaElementoFicarVisivel(By.xpath("(//a[contains(@class,'header-title homeui-tc-entretenimento')])[2]"),10);
        driver.findElement(By.xpath("(//a[contains(@class,'header-title homeui-tc-entretenimento')])[2]")).click();

    }

    public void vaiParaQuem(){
        esperaElementoFicarVisivel(By.xpath("//a[contains(@class,'header-title homeui-tc-quem')]"),10);
        driver.findElement(By.xpath("//a[contains(@class,'header-title homeui-tc-quem')]")).click();

    }

    public void vaiParaReceitas() {
        esperaElementoFicarVisivel(By.xpath("//a[contains(@class,'header-title homeui-tc-receitas')]"),10);
        driver.findElement(By.xpath("//a[contains(@class,'header-title homeui-tc-receitas')]")).click();

    }

    public void vaiParaGigaGlobo() {
        esperaElementoFicarVisivel(By.xpath("//a[contains(@class,'header-title homeui-tc-gigagloob')]"),10);
        driver.findElement(By.xpath("//a[contains(@class,'header-title homeui-tc-gigagloob')]")).click();

    }

    public void telaAssinatura() {
        WebElement element = driver.findElement(By.xpath("//button[@type='button'][contains(.,'Assinar')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();

    }

    public void assertTela() {

        Assert.assertEquals("Testes concluidos com sucesso", true, driver.findElement(By.xpath("//div[contains(@class, 'account-header')]")).isDisplayed());
    }


}
