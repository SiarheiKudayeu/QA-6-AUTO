package lesson7.waiters;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitersThree {
    public static void main(String[] args){
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ez-accept-all")));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("ez-accept-all"))).click();
        }catch (Exception e){}

        //presenceOfElementLocated
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));

        //presenceOfElementLocated
        wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("Username"), "Text"));
        driver.findElement(By.id("Password")).sendKeys("Password");
        WebElement passField = driver.findElement(By.id("Password"));

        //invisibilityOf
        driver.get("https://dan-it.com.ua/uk");
        wait.until(ExpectedConditions.invisibilityOf(passField));

        //titleIs
        wait.until(ExpectedConditions.titleIs("Курси програмування в Україні (онлайн та офлайн)☑️ IT курси з працевлаштуванням"));

        //titleContains
        wait.until(ExpectedConditions.titleContains("Курси програмування в "));
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }



}
