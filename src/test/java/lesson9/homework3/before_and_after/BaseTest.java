package lesson9.homework3.before_and_after;

import driverFactory.DriverSetUp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.ActionsClass;

public class BaseTest {


    @BeforeSuite
    public void precondition(){
        System.out.println("Class was started@!");
    }

    @AfterSuite
    public void postConditions(){
        System.out.println("Class ended");
    }

}
