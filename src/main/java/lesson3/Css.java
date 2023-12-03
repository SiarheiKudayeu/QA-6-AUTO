package lesson3;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Css {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();

        //пробелы заменяем точками, имя класа тоже начинается с точки
        driver.get("https://rozetka.com.ua/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='header__button ng-star-inserted'])[1]")).click();
        /** by id #*/
        driver.findElement(By.cssSelector("#auth_email")).sendKeys("Text");
        driver.findElement(By.cssSelector("#auth_pass")).sendKeys("1223354");
        driver.findElement(By.xpath("//label[@class='auth-modal__remember-checkbox']")).click();
        /** by class name .*/
        System.out.println(driver.findElement(By.cssSelector(".button--link.ng-star-inserted")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='modal__close']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
