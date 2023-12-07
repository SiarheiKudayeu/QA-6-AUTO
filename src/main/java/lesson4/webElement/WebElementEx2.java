package lesson4.webElement;

import driverFactory.DriverSetUp;
import lesson2.Finalist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementEx2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        Finalist.acceptCookies(driver);
        WebElement checkBox = driver.findElement(By.id("RememberMe"));
        System.out.println("isDisplayed? " + checkBox.isDisplayed());
        System.out.println("isEnabled? " + checkBox.isEnabled());
        System.out.println("isSelected? " + checkBox.isSelected());
        System.out.println("=================");
        Thread.sleep(1500);
        checkBox.click();
        Thread.sleep(1500);
        System.out.println("isDisplayed? " + checkBox.isDisplayed());
        System.out.println("isEnabled? " + checkBox.isEnabled());
        System.out.println("isSelected? " + checkBox.isSelected());
        driver.quit();

    }
}
