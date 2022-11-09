import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class Exercise_7 {
    static WebDriver driver;

    @BeforeAll
    static void prepareBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com");
        new LoginPage(driver).login("standard_user", "secret_sauce");
    }

    @AfterAll()
    static void afterTests() {
        driver.quit();
    }

    @Test
    void addItemAndRemove() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector(".shopping_cart_container")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        String Zero = driver.findElement(By.cssSelector(".shopping_cart_container")).getText();
        Assertions.assertEquals("", Zero.trim());
    }
}
