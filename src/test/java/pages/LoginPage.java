package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage<LoginPage>{


    public LoginPage (WebDriver driver){
        super(driver);
    }

    public LoginPage open(){
        return getPage(baseUrl + "login.php");
    }

    private By usernameInput = By.name("username");
    private By passwordInput = By.name("password");
    private By loginBtn = By.name("login");

    public void authorize(){
        typeIn(usernameInput, "admin");
        typeIn(passwordInput, "admin");
        click(loginBtn);
    }





}
