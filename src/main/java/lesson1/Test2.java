package lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.google.com/");
        Thread.sleep(1500);
        try {
            chromeDriver.findElement(By.xpath("//div[text()='Accept alkl']")).click();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        chromeDriver.findElement(By.xpath("//div[text()='Accept all']")).click();
        Thread.sleep(1500);
        chromeDriver.quit();
    }
}
