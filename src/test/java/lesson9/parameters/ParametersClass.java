package lesson9.parameters;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ActionsClass;

public class ParametersClass {

    static WebDriver driver;
    static ActionsClass actionsClass;

    @BeforeClass
    public void precondition() {
        driver = DriverSetUp.setUpDriver();
        actionsClass = new ActionsClass(driver);
    }

    @AfterClass
    public void postConditions() {
        driver.quit();
    }


    @Test
    @Parameters({"login","password"})
    public void loginTest(String login, String password) throws InterruptedException {
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        actionsClass.sendKeys(By.id("email"), login);
        Thread.sleep(1500);
        actionsClass.sendKeys(By.id("passwd"), password);
        actionsClass.click(By.id("SubmitLogin"));
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-danger p")).getText().contains("error"));
    }
}
