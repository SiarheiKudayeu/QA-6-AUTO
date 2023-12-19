package lesson9.homework3;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.ActionsClass;

import java.util.Set;

public class HomeWork3 {
    @Test
    public void homework3() throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.google.com/search");
        ActionsClass actionsClass = new ActionsClass(driver);
        actionsClass.click(By.xpath("//div[text()='Accept all']"));
        actionsClass.sendKeys(By.name("q"), "https://www.hyrtutorials.com/p/alertsdemo.html");
        actionsClass.sendKeys(By.name("q"), Keys.ENTER);
        String handle1 = driver.getWindowHandle();
        Set<String> windowHandles1 = driver.getWindowHandles();
        actionsClass.clickAndOpenInNewWindow(By.xpath("//h3[text()='AlertsDemo']"));
        Set<String> windowHandles2 = driver.getWindowHandles();
        windowHandles2.removeAll(windowHandles1);
        String handle2 = windowHandles2.iterator().next();
        actionsClass.clearAndSendKeys(By.name("q"), "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        actionsClass.sendKeys(By.name("q"), Keys.ENTER);

        Set<String> windowHandles3 = driver.getWindowHandles();
        actionsClass.clickAndOpenInNewWindow(By.xpath("//h3[text()='W3Schools Tryit Editor - HTML Forms']"));
        Set<String> windowHandles4 = driver.getWindowHandles();
        windowHandles4.removeAll(windowHandles3);
        String handle3 = windowHandles4.iterator().next();

        actionsClass.clearAndSendKeys(By.name("q"), "https://www.guinnessworldrecords.com/account/register?");
        actionsClass.sendKeys(By.name("q"), Keys.ENTER);
        actionsClass.click(By.xpath("(//h3[text()='Create account'])[1]"));
        Thread.sleep(1500);
        actionsClass.click(By.id("ez-accept-all"));
        System.out.println(driver.getTitle());


        driver.switchTo().window(handle2);
        Thread.sleep(1500);
        actionsClass.click(By.xpath("//p[text()='Consent']"));
        System.out.println(driver.getTitle());

        driver.switchTo().window(handle3);
        Thread.sleep(1500);
        actionsClass.click(By.id("accept-choices"));
        System.out.println(driver.getTitle());
    }
}
