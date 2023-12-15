package lesson7.waiters;

import driverFactory.DriverSetUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitersTwo {
    public static void main(String[] args){
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //elementToBeClickable
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ez-accept-all")));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("ez-accept-all"))).click();
        }catch (Exception e){}

        //elementToBeSelected
        wait.until(ExpectedConditions.elementToBeSelected(By.id("RememberMe")));
        driver.findElement(By.id("Username")).sendKeys("QA");

        //elementSelectionStateToBe
        wait.until(ExpectedConditions.elementSelectionStateToBe(By.id("RememberMe"), false));
        driver.findElement(By.id("Password")).sendKeys("Password");

    }



}
