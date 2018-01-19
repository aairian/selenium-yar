import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleTestViaDriverManager {

    WebDriver driver;

    @After
    public void quit(){
        driver.quit();
    }

    @Test
    public void searchByKeyIE(){
        InternetExplorerDriverManager.getInstance().arch32().setup();
        driver = new InternetExplorerDriver();
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Selenium");
    }

    @Test
    public void searchByKeyFirefox(){
        FirefoxDriverManager.getInstance().arch64().setup();
        driver = new FirefoxDriver();
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Selenium");
    }

    @Test
    public void searchByKeyChrome(){
        ChromeDriverManager.getInstance().arch64().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Selenium");
    }
}
