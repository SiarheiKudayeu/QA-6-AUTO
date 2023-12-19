package lesson9.parameters;

import driverFactory.DriverSetUp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ActionsClass;

import java.time.Duration;

public class ParametersClass2 {

    static WebDriver driver;
    static ActionsClass actionsClass;

    @BeforeClass
    @Parameters({"browser"})
    public void precondition(String browser) {
      if(browser.equalsIgnoreCase("chrome")){
          WebDriverManager.chromedriver().setup();
          ChromeOptions options = new ChromeOptions();
          options.addArguments("--disable-notifications");
          driver = new ChromeDriver(options);
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
          driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
          actionsClass = new ActionsClass(driver);
      }if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }

    @AfterClass
    public void postConditions() {
        driver.quit();
    }


    @Test
    public void loginTest() throws InterruptedException {
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        actionsClass.sendKeys(By.id("email"), "login");
        Thread.sleep(1500);
        actionsClass.sendKeys(By.id("passwd"), "password");
        actionsClass.click(By.id("SubmitLogin"));
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-danger p")).getText().contains("error"));
    }
}
