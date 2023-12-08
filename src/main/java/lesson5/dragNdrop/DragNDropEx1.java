package lesson5.dragNdrop;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragNDropEx1 {
    public static void main(String[] args) throws InterruptedException {
        //https://www.signesduquotidien.org/
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.signesduquotidien.org/");
        // .dots-icon
        // .icon-ouverture
        // .icon-projets

        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.cssSelector(".dots-icon")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.cssSelector(".icon-ouverture")))
                .clickAndHold()
                .moveToElement(driver.findElement(By.cssSelector(".dots-icon")))
                .release()
                .build().perform();

        Thread.sleep(7000);
        driver.findElement(By.id("menu-btn")).click();
        Thread.sleep(3000);
        actions.dragAndDrop(driver.findElement(By.cssSelector(".icon-projets")),
                driver.findElement(By.cssSelector(".dots-icon"))).perform();
    }
}
