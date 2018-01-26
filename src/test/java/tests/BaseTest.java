package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.runners.Parameterized;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {

    @Parameterized.Parameter
    public EventFiringWebDriver driver;

    protected WebDriverWait wait;


    @Parameterized.Parameters
    public static WebDriver[] getDriver(){
        return new WebDriver[]{ new EventFiringWebDriver(new FirefoxDriver()),
                new EventFiringWebDriver(new InternetExplorerDriver()),
                new EventFiringWebDriver(new ChromeDriver())};
    }


    @Before
    public void setUp(){
        System.out.println("---DRIVER START---");
        wait = new WebDriverWait(driver, 5);
    }

    @After
    public void tearDown() {
        System.out.println("---DRIVER CLOSE---");
        driver.quit();
    }

//    protected void setDriver(String browser, boolean isHeadless){
//        switch (browser){
//            case BrowserType.FIREFOX:
//                FirefoxDriverManager.getInstance().setup();
//                FirefoxOptions opt = new FirefoxOptions();
//                opt.setHeadless(isHeadless);
//                driver = new EventFiringWebDriver(new FirefoxDriver(opt));
//                break;
//            case BrowserType.CHROME:
//                ChromeDriverManager.getInstance().setup();
//                ChromeOptions chrOpt = new ChromeOptions();
//                chrOpt.setHeadless(isHeadless);
//                driver = new EventFiringWebDriver(new ChromeDriver(chrOpt));
//                break;
//            case BrowserType.IE:
//                InternetExplorerDriverManager.getInstance().arch32().setup();
//                driver = new EventFiringWebDriver(new InternetExplorerDriver());
//                break;
//        }
//    }
}
