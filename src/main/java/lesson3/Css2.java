package lesson3;

import driverFactory.DriverSetUp;
import lesson2.Finalist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Css2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.guinnessworldrecords.com/search?term=%2A");
        //by Tag name
        List<WebElement> inputs = driver.findElements(By.cssSelector("input"));

        System.out.println(inputs.size());

        driver.findElements(By.cssSelector("input")).get(1).sendKeys("Handstand push ups");
        driver.findElement(By.cssSelector("button[id='search-button']")).click();

        //по буквосочетанию атрибута
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[data-type*='cor']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[data-type$='cle']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[data-type^='al']")).click();
        Thread.sleep(3000);

        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        try {
            Finalist.acceptCookies(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("div.region-a .columned.block-4-12 [href$='process']")).click();
        Thread.sleep(3000);

        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.cssSelector(".btn:not(.blue)")).getText());
        System.out.println(driver.findElement(By.cssSelector(".btn.blue")).getText());

        driver.quit();




    }
}
