package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;


@RunWith(Parameterized.class)
public class GoogleTestViaLocalDriver extends BaseTest{

    @Test
    public void searchByKeyIE(){
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Selenium");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }

    @Test
    public void searchByKeyFirefox(){
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Selenium");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }

    @Test
    public void searchByKeyChrome(){
        driver.get("https://google.com");
        driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Selenium");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }
}
