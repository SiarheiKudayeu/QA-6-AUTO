package lesson7.homeWork;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class OpenLinkInNewTabAndSwitch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://dan-it.com.ua/uk/");
        Actions actions = new Actions(driver);

        Set<String> windowHandlerOne = driver.getWindowHandles();
        actions.keyDown(Keys.COMMAND).click(driver.findElement(By.xpath("//a[text()='Для дітей']")))
                .keyUp(Keys.COMMAND).build().perform();
        Set<String> windowHandlerTwo = driver.getWindowHandles();
        windowHandlerTwo.removeAll(windowHandlerOne);
        String newWindowHandler = windowHandlerTwo.iterator().next();
        driver.switchTo().window(newWindowHandler);
        driver.get("https://guinnessworldrecords.com/records/");
        Thread.sleep(5000);
        driver.quit();

    }
}
