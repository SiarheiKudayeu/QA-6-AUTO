package lesson8.waiters;

import driverFactory.DriverSetUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaiterClass;

import java.time.Duration;

public class CustomWaitersTest {
    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        WaiterClass waiter = new WaiterClass(driver);
        //visibilityOfElementLocated
        waiter.waitForVisabilityOfWebElementAndReturnElement(By.id("accept-choices")).click();
        //frameToBeAvailableAndSwitchToIt
        waiter.waitForIframeAndClickElementInside(By.id("iframeResult"), By.xpath("//button[text()='Try it']"));
        //alertIsPresent
        Alert alert = waiter.switchToAlert();
        System.out.println(alert.getText());
        alert.accept();
        driver.quit();
    }
}
