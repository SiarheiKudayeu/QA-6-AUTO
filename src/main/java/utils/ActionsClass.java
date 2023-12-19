package utils;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    WebDriver driver;
    WaiterClass waiterClass;
    Actions actions;

    public ActionsClass(WebDriver driver) {
        this.driver = driver;
        this.waiterClass = new WaiterClass(driver);
        this.actions = new Actions(driver);
    }

    public void click(By locator){
        waiterClass.waitForVisabilityOfWebElement(locator);
        driver.findElement(locator).click();
    }

    public void clickAndOpenInNewWindow(By locator){
        waiterClass.waitForVisabilityOfWebElement(locator);
        actions.keyDown(Keys.COMMAND).click(driver.findElement(locator)).keyUp(Keys.COMMAND).build().perform();
    }

    public void sendKeys(By locator, String text){
        waiterClass.waitForVisabilityOfWebElement(locator);
        driver.findElement(locator).sendKeys(text);
    }
    public void sendKeys(By locator, Keys key){
        waiterClass.waitForVisabilityOfWebElement(locator);
        driver.findElement(locator).sendKeys(key);
    }

    public void clearAndSendKeys(By locator, String text){
        waiterClass.waitForVisabilityOfWebElement(locator);
        driver.findElement(locator).clear();
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
