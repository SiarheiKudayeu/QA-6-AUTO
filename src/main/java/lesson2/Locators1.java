package lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
    static void acceptCookies(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        WebElement acceptCookies = driver.findElement(By.id("ez-accept-all"));
        acceptCookies.click();
        Thread.sleep(5000);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //поиск по id
        /*
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(2000);
        WebElement acceptCookies = driver.findElement(By.id("ez-accept-all"));
        acceptCookies.click();*//*
        try {
            driver.findElement(By.id("ez-accept-all")).click();
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        Thread.sleep(5000);
        driver.findElement(By.id("globe")).click();
        //driver.findElement(By.xpath("//a[@title='Select Language']")).click();
*/

        //find by name
    /*    driver.get("https://www.google.com/");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[text()='Accept all']")).click();
        driver.findElement(By.name("q")).sendKeys("QA-6");*/

        //By className
/*        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        acceptCookies(driver);
        Thread.sleep(5000);
        driver.findElement(By.className("useraccount2")).click();*/


        //By TagName
/*        driver.get("https://www.guinnessworldrecords.com/Account/Login?ReturnUrl=%2faccount");
        acceptCookies(driver);
        Thread.sleep(2000);
        String textOfH1 = driver.findElement(By.tagName("h1")).getText();
        System.out.println(textOfH1);
        driver.quit();*/

        //By linkText
        driver.get("https://www.guinnessworldrecords.com/Account/Login?ReturnUrl=%2faccount");
        acceptCookies(driver);
        System.out.println(driver.findElement(By.linkText("Forgotten your password?")).getText());
        driver.findElement(By.partialLinkText("Create a")).click();
        //driver.quit();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div/div/form/section[1]/div[1]/div[2]/div[2]/input"))
                .sendKeys("Bad Xpath");


    }
}
