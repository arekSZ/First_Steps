package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "user-name")
    public WebElement usernameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(name = "login-button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToInput(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public ShopPage login(String username, String password) {
        sendKeysToInput(username, password);
        clickLoginButton();
        return new ShopPage(driver);
    }
}
