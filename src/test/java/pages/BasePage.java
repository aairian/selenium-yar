package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage<T> {

    protected static final String baseUrl = "http://localhost/litecart/admin/";

    protected WebDriverWait wait;
    protected WebDriver driver;

    protected BasePage(WebDriver driver){
        this.driver = driver;
    }

    public static String getUrl() {
        return baseUrl;
    }


    public String getCurrUrl() {
        return driver.getCurrentUrl();
    }

    private void setWait(){
        wait = new WebDriverWait(driver, 20);
    }

    protected T getPage(String url){
        driver.get(url);
        return (T) this;
    }

    protected WebElement find(By element) {
        return driver.findElement(element);
    }

    protected List<WebElement> findElems(By element) {
        return driver.findElements(element);
    }

    protected void typeIn(By element, String input) {
        find(element).sendKeys(input);
    }

    protected void click(By element) {
        find(element).click();
    }


}
