package lesson6.doubleAndContext;

import driverFactory.DriverSetUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndContextEx {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        Actions actions = new Actions(driver);
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        Thread.sleep(1500);
        try {
            driver.switchTo().frame(driver.findElement(By.id("gdpr-consent-notice")));
            driver.findElement(By.xpath("//span[text()='Accept All']")).click();
        } catch (Exception e){}

        //First button context click
        Thread.sleep(1500);
        actions.contextClick(driver.findElement(By.cssSelector(".context-menu-one.btn"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Quit']")).click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(alert.getText());
        alert.accept();

        //Second button double click
        Thread.sleep(1000);
        actions.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).perform();
        Thread.sleep(1000);
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.accept();
        Thread.sleep(1000);
        driver.quit();
    }
}
