package utils;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsClass {
    WebDriver driver;
    WaiterClass waiterClass;

    public ActionsClass(WebDriver driver) {
        this.driver = driver;
        this.waiterClass = new WaiterClass(driver);
    }

    public void click(By locator){
        waiterClass.waitForVisabilityOfWebElement(locator);
        driver.findElement(locator).click();
    }

    public void senKeys(By locator, String text){
        waiterClass.waitForVisabilityOfWebElement(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public String getTextFromElement(By locator){
        waiterClass.waitForVisabilityOfWebElement(locator);
        return driver.findElement(locator).getText();
    }

    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        ActionsClass actionsClass = new ActionsClass(driver);
        actionsClass.click(By.id("accept-choices"));
    }
}
