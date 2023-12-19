package lesson9.parallel;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.ActionsClass;

public class ParallelMethodsTest {



    @Test
    public void a() {
        WebDriver driver = DriverSetUp.setUpDriver();
        ActionsClass actionsClass = new ActionsClass(driver);
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
        driver.quit();
    }

    @Test
    public void b() {
        WebDriver driver = DriverSetUp.setUpDriver();
        ActionsClass actionsClass = new ActionsClass(driver);
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
        driver.quit();
    }

    @Test
    public void c() {
        WebDriver driver = DriverSetUp.setUpDriver();
        ActionsClass actionsClass = new ActionsClass(driver);
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
        driver.quit();
    }

    @Test
    public void d() {
        WebDriver driver = DriverSetUp.setUpDriver();
        ActionsClass actionsClass = new ActionsClass(driver);
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
        driver.quit();
    }

    @Test
    public void e() {
        WebDriver driver = DriverSetUp.setUpDriver();
        ActionsClass actionsClass = new ActionsClass(driver);
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
        driver.quit();
    }
    @Test
    public void edfbe() {
        WebDriver driver = DriverSetUp.setUpDriver();
        ActionsClass actionsClass = new ActionsClass(driver);
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
        driver.quit();
    }
    @Test
    public void edfb() {
        WebDriver driver = DriverSetUp.setUpDriver();
        ActionsClass actionsClass = new ActionsClass(driver);
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
        driver.quit();
    }
    @Test
    public void edf() {
        WebDriver driver = DriverSetUp.setUpDriver();
        ActionsClass actionsClass = new ActionsClass(driver);
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
        driver.quit();
    }
    @Test
    public void egg() {
        WebDriver driver = DriverSetUp.setUpDriver();
        ActionsClass actionsClass = new ActionsClass(driver);
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
        driver.quit();
    }
    @Test
    public void eer() {
        WebDriver driver = DriverSetUp.setUpDriver();
        ActionsClass actionsClass = new ActionsClass(driver);
        driver.get("http://www.automationpractice.pl/");
        String inputForSearch = "iPhone 11";
        actionsClass.sendKeys(By.xpath("(//input[@type ='text'])[1]"), inputForSearch);
        actionsClass.click(By.xpath("(//button[@type ='submit'])[1]"));
        String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertTrue(resultSearchText.contains(inputForSearch), "Search is not working :(");
        driver.quit();
    }

}
