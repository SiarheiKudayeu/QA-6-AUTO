package lesson6.iframe;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframeEx {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://demoqa.com/nestedframes");
        Thread.sleep(1500);
        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.tagName("body")).getText());
        WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(childFrame);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//*[text()='Forms']")).getText());
        driver.quit();
    }
}
