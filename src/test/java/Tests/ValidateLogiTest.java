package Tests;

import Pages.LoginPage;
import StepDefinition.LoginStepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class ValidateLogiTest {
    public WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://practicetestautomation.com/practice-test-login");
    }
    @Test
    public void TestuserLogin(){
        LoginPage loginPage=new LoginPage(driver);
        LoginStepDefinition step= new LoginStepDefinition(driver);

        step.userEnterCredentials();
        step.userclicksSubbmitbutton();
    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }

}
