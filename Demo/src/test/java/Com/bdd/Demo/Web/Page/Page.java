package Com.bdd.Demo.Web.Page;

import Com.bdd.Demo.Web.Path.Path;

import com.sun.deploy.cache.Cache;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;



public class Page {

    Path pathDemo = new Path();
    private WebDriver driver;

    public void IniciarWeb() throws Exception {

        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(5000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Cache FileUtil = null;
        FileUtil.copyFile(scrFile, new File("src/test/resources/Screenshots/iniciarweb"+ LocalDate.now()+".png"));
    }

    public void RegistrarUsuario() throws InterruptedException{
        //línea para agregar un ususario aleatorio
        // String v_nombre = "Gustavo" + Math.round(Math.random() * 100) / 10;

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.registro))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.usuario))).sendKeys("TestBaufest2");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.contrasena))).sendKeys("12345");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.registrar))).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
    }

    public void IniciarSesion() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.login))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.usuariologin))).sendKeys("TestBaufest2");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.contrasenalogin))).sendKeys("12345");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.iniciarsesion))).click();
        Thread.sleep(5000);
    }

    public void AgregarCarrito() throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.laptops))).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.sony))).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.agregar))).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Cache FileUtil = null;
        FileUtil.copyFile(scrFile, new File("src/test/resources/Screenshots/productoagregado"+ LocalDate.now()+".png"));
    }

    public void VerCarrito() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.carrito))).click();
        Thread.sleep(5000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Cache FileUtil = null;
        FileUtil.copyFile(scrFile, new File("src/test/resources/Screenshots/carrito"+ LocalDate.now()+".png"));
    }

    public void CerrarSesion(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pathDemo.logout))).click();
    }

}
