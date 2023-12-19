package lesson8;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.ActionsClass;

import static org.testng.Assert.assertFalse;

public class Lesson8Class2 extends BaseTest {

    @Test
    public void checkPageTitle() {
        driver.get("https://klopotenko.com/en/");
        actionsClass.click(By.xpath("//a[@aria-label='dismiss cookie message']"));
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Chef Ievgen Klopotenko"), "Name of page is not true");
        assertFalse(driver.getTitle().contains("Chef Ievgencc Klopotenko"), "Name of page is true");
        WebElement element = driver.findElement(By.xpath("(//a[text()='Ukrainian'])[2]"));
        Assert.assertEquals(element.getText(), "UKRAINIAN");
        Assert.assertNotEquals(element.getText(), "UKRAINIANw");
    }

    @Test
    public void searchFieldFunction() throws InterruptedException {
        driver.navigate().to("https://www.guinnessworldrecords.com/search");
        Thread.sleep(3000);
        String search = "handstand";
        actionsClass.sendKeys(By.id("search-term"), search);
        actionsClass.click(By.id("search-button"));
        Assert.assertTrue(actionsClass.getTextFromElement(By.tagName("h2")).contains("search"));
    }

    @Test
    public void workingCheckBox(){
        driver.navigate().to("https://www.guinnessworldrecords.com/Account/Login");
        actionsClass.click(By.id("ez-accept-all"));
        By rememberMe = By.id("RememberMe");
        WebElement checkBox = driver.findElement(rememberMe);
        Assert.assertTrue(checkBox.isDisplayed());
        Assert.assertFalse(checkBox.isSelected());
        actionsClass.click(rememberMe);
        Assert.assertTrue(checkBox.isSelected());
        actionsClass.click(rememberMe);
        Assert.assertFalse(checkBox.isSelected());
    }

}
