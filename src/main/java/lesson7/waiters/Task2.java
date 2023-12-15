package lesson7.waiters;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task2 {
    public static void main(String[] args) {
        WebDriver driver= DriverSetUp.setUpDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/nestedframes");
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame1")));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.quit();
    }
}
