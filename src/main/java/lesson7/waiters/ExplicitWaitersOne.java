package lesson7.waiters;

import driverFactory.DriverSetUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitersOne {
    public static void main(String[] args){
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //visibilityOfElementLocated
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accept-choices"))).click();

        //frameToBeAvailableAndSwitchToIt
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeResult")))
                .findElement(By.xpath("//button[text()='Try it']")).click();

        //alertIsPresent
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent()).accept();
        driver.quit();
    }



}
