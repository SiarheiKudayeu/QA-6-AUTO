package lesson9.parallel;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ActionsClass;

public class ParallelClassTest2 {
    static WebDriver driver;
    static ActionsClass actionsClass;


    @Test
    public void a() {
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
    }

    @Test
    public void b() {
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
    }

    @Test
    public void c() {
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
    }

    @Test
    public void d() {
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
    }

    @Test
    public void e() {
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
    }




    @BeforeClass
    public void precondition() {
        driver = DriverSetUp.setUpDriver();
        actionsClass = new ActionsClass(driver);
    }

    @AfterClass
    public void postConditions() {
        driver.quit();
    }
}
