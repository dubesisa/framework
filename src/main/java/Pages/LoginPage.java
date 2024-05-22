package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage() {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username");
    private WebElement usernameFiled;
    @FindBy(id = "password");
    private WebElement passwordfield;
    @FindBy(id = "submit");
    private WebElement submitbutton;

    public void EnterCredentials(String Name, String password) {

        usernameFiled.sendKeys(Name);
        passwordfield.sendKeys(password);
    }

    public void ClickSubmitButton() {
        submitbutton.click();
    }

}
