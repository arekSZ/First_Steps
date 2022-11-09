import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise_3_4_5 {
    static WebDriver driver;

    @Test
    void searchFieldAndLogo() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://automationpractice.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertTrue(driver.findElement(By.xpath("//img[@class = 'logo img-responsive']")).isDisplayed());
        assertTrue(driver.findElement(By.id("search_query_top")).isDisplayed());
        driver.findElement(By.xpath("//a[@class = 'login']")).click();
        assertAll("Should return logo and search query", () -> assertTrue(driver.findElement(By.xpath("//img[@class = 'logo img-responsive']")).isDisplayed()), () -> assertTrue(driver.findElement(By.id("search_query_top")).isDisplayed()));
        driver.quit();
    }

    @Test
    void homePageToContactPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://automationpractice.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("contact-link")).click();
        assertTrue(driver.findElement(By.id("message")).isDisplayed());
        driver.quit();
    }

    @Test
    void loginPageToMainPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//i[@class = 'icon-home']")).click();
        assertTrue(driver.findElement(By.id("homepage-slider")).isDisplayed());
        driver.quit();
    }
}
