package lesson6.tasks;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragNDropClass {
    public static void drop(By lokator1, By lokator2, WebDriver driver){
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(lokator1))
                .moveToElement(driver.findElement(lokator2))
                .release().build().perform();
    }

    public static void main(String[] args) throws InterruptedException {
        //https://www.signesduquotidien.org/
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.signesduquotidien.org/");
        // .dots-icon
        // .icon-ouverture
        // .icon-projets

        Thread.sleep(5000);
        driver.findElement(By.id("menu-btn")).click();
        Thread.sleep(2000);

        drop(By.cssSelector(".icon-ouverture"),By.cssSelector(".dots-icon"), driver);
    }
}
