package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPageAdmin extends BasePage<MainPageAdmin> {


    public MainPageAdmin(WebDriver driver){
        super(driver);
    }

    private By menuAppList = By.cssSelector("#box-apps-menu li#app-");
    private By subMenuAppList = By.xpath("//li[contains(@id, 'doc-')]");
    private By header = By.cssSelector("#content h1");

    public MainPageAdmin openPage(){
        return getPage(baseUrl);
    }

    public List<WebElement> getMenuList() {
        return findElems(menuAppList);
    }

    public List<WebElement> getSubMenuList() {
        return findElems(subMenuAppList);
    }

    public boolean isHeaderPresent() {
        return findElems(header).size() > 0;
    }

    public void clickToItem(int index) {
        find(By.xpath("//li[@id='app-']["+ index +"]")).click();
    }

    public void clickToSubItem(int index) {
        find(By.xpath("//li[contains(@id, 'doc-')]["+ index +"]")).click();
    }
}
