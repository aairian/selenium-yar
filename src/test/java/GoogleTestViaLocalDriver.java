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

public class GoogleTestViaLocalDriver {

    WebDriver driver;

    @After
    public void quit(){
        driver.quit();
    }

    @Test
    public void searchByKeyIE(){
        driver = new InternetExplorerDriver();
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Selenium");
    }

    @Test
    public void searchByKeyFirefox(){
        driver = new FirefoxDriver();
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Selenium");
    }

    @Test
    public void searchByKeyChrome(){
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Selenium");
    }
}
