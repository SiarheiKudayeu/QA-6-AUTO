package lesson6.iframe;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class IframeEx2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe_frameborder_css");

        try {
            driver.findElement(By.id("accept-choices")).click();
        } catch (Exception e){
            System.out.println("Element with id 'accept-choices' is not found...");
        }

        //
        //iframe[@src='/default.asp'][2]
        driver.switchTo().frame("iframeResult");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/default.asp'][2]")));

        try {
            driver.findElement(By.id("accept-choices")).click();
        } catch (Exception e){
            System.out.println("Element with id 'accept-choices' is not found...");
        }
        driver.findElement(By.id("tnb-google-search-input")).sendKeys("Text");
        driver.findElement(By.id("tnb-google-search-input")).sendKeys(Keys.ENTER);
        Thread.sleep(4500);
        driver.quit();

    }
}
