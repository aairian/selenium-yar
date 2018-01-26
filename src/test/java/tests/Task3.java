package tests;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import pages.BasePage;
import pages.LoginPage;
import pages.MainPageAdmin;

import java.nio.file.Watchable;
import java.util.stream.IntStream;

@RunWith(Parameterized.class)
public class Task3 extends BaseTest{


    @Test
    public void task3_1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.authorize();
        assertThat(loginPage.getCurrUrl(), equalToIgnoringCase(BasePage.getUrl()));
        MainPageAdmin mainPageAdmin = new MainPageAdmin(driver);
        IntStream.rangeClosed(1, mainPageAdmin.getMenuList().size())
                .forEach(item -> {
                    mainPageAdmin.clickToItem(item);
                    assertTrue(mainPageAdmin.isHeaderPresent());
                    System.out.println("CLICK -- " + mainPageAdmin.getCurrUrl());
                    IntStream.rangeClosed(1, mainPageAdmin.getSubMenuList().size())
                            .forEach(subI -> {
                                mainPageAdmin.clickToSubItem(subI);
                                assertTrue(mainPageAdmin.isHeaderPresent());
                                System.out.println("CLICK -- " + mainPageAdmin.getCurrUrl());
                            });
                });
    }
}
