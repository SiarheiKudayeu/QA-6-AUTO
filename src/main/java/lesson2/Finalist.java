package lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finalist {

    public static void acceptCookies(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        WebElement acceptCookies = driver.findElement(Locators.acceptCookies);
        acceptCookies.click();
        Thread.sleep(5000);
    }


    private static class Url {
        private static final String accountLogin = "https://www.guinnessworldrecords.com/Account/Login";
        private static final String applyRecord = "https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/";
    }

    private static class Locators {
        private static final By acceptCookies = By.id("ez-accept-all");
        private static final By userNameField = By.xpath("//input[@data-val-length-max>100]");
        private static final By passwordField = By.xpath("//input[@data-val-length-max!=255]");
        private static final By checkBox = By.id("RememberMe");
        private static final By button = By.xpath("(//a[@href='/records/apply-to-set-or-break-a-record'])[2]/../following-sibling::div[last()]/a");
    }

    private static class Data {
        private static final String login = "AQA";
        private static final String password = "text";
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(Url.applyRecord);
        acceptCookies(driver);
        driver.findElement(Locators.button).click();
        Thread.sleep(3000);


        driver.get(Url.accountLogin);
        try {
            acceptCookies(driver);
        }catch (NoSuchElementException e){
            System.out.println("Element not found");
        }
        driver.findElement(Locators.userNameField).sendKeys(Data.login);
        driver.findElement(Locators.passwordField).sendKeys(Data.password);
        driver.findElement(Locators.checkBox).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
