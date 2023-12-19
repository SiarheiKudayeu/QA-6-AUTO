package lesson9.data_provider;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ActionsClass;

public class DataProviderClass {
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


    @Test(dataProvider = "loginParameters")
    public void loginTest(String login, int password) throws InterruptedException {
        driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        actionsClass.sendKeys(By.id("email"), login);
        Thread.sleep(1500);
        actionsClass.sendKeys(By.id("passwd"), String.valueOf(password));
        actionsClass.click(By.id("SubmitLogin"));
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-danger p")).getText().contains("error"));
    }

    @DataProvider(name = "loginParameters")
    public Object[][] createData() {
        return new Object[][]{
                {"email1", 1213132},
                {"email2", 131231},
                {"email3", 131324},
        };
    }
}
