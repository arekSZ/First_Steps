import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Exercise_1_2 {
    static WebDriver driver;

    @Test
    void emptyLoginField() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.saucedemo.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("login-button"));
        passwordInput.sendKeys("Passwd123");
        submitButton.click();
        WebElement errorBox = driver.findElement(By.cssSelector(".error-message-container"));
        Assertions.assertEquals("Epic sadface: Username is required", errorBox.getText());
        driver.quit();


    }

    @Test
    void emptyPasswordField() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.saucedemo.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement loginInput = driver.findElement(By.id("user-name"));
        WebElement submitButton = driver.findElement(By.id("login-button"));
        loginInput.sendKeys("LoginTest");
        submitButton.click();
        WebElement errorBox = driver.findElement(By.cssSelector(".error-message-container"));
        Assertions.assertEquals("Epic sadface: Password is required", errorBox.getText());
        driver.quit();
    }
}
