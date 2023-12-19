package lesson8;

import driverFactory.DriverSetUp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.ActionsClass;

public class BaseTest {
    static WebDriver driver;
    static ActionsClass actionsClass;

    @BeforeMethod
    public void precondition(){
        driver = DriverSetUp.setUpDriver();
        actionsClass = new ActionsClass(driver);
    }

    @AfterMethod
    public void postConditions(){
        driver.quit();
    }

}
