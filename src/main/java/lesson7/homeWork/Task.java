package lesson7.homeWork;

import driverFactory.DriverSetUp;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {
    public static void dragNdrop(int x, int y, WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("[r='40']")))
                .clickAndHold().moveToElement(driver.findElement(By.cssSelector("[r='8']")), x, y).release().build().perform();

    }
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(10000);
        dragNdrop(0, 30, driver);
        Thread.sleep(5000);
        dragNdrop(0, -30, driver);
        Thread.sleep(5000);
        dragNdrop(30, 0, driver);

    }
}
