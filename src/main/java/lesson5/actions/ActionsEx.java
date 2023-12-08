package lesson5.actions;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsEx {
    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://dan-it.com.ua/uk/");
        Actions actions = new Actions(driver);

        //moveTo
        /*actions.moveToElement(driver.findElement(By.xpath("//a[text()='Для дорослих']"))).perform();
        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Тестування']"))).perform();
        driver.findElement(By.xpath("//a[text()='Quality Assurance (QA)']")).click();*/

/*        actions
                .moveToElement(driver.findElement(By.xpath("//a[text()='Для дорослих']")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Тестування']")))
                .click(driver.findElement(By.xpath("//a[text()='Quality Assurance (QA)']")))
                .build().perform();*/

        //.moveByOffset()
        //Дата-аналітика Java
 /*       actions
                .moveToElement(driver.findElement(By.xpath("//a[text()='Для дорослих']")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Дата-аналітика']")),0,42)
                .click(driver.findElement(By.xpath("//a[text()='Java']")))
                .build().perform();*/


/*        actions
                .moveToElement(driver.findElement(By.xpath("//a[text()='Для дорослих']")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Дата-аналітика']")))
                .moveByOffset(0,42)
                .click(driver.findElement(By.xpath("//a[text()='Java']")))
                .build().perform();*/

        //keyDown, keyUp
        actions
                .moveToElement(driver.findElement(By.xpath("//a[text()='Для дорослих']")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Дата-аналітика']")))
                .moveByOffset(0,42)
                .keyDown(Keys.COMMAND)
                .click(driver.findElement(By.xpath("//a[text()='Java']")))
                .keyUp(Keys.COMMAND)
                .build().perform();








    }
}
