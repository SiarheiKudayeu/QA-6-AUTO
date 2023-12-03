package lesson3;

import driverFactory.DriverSetUp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {
    // На сайте https://rozetka.com.ua/ открыть форму логина, ввести имя и пароль, убрать чекбокс "Запомнить меня"
    // Вывести в консоль текст элемента "Зарегистрироваться"
    // Закрыть модальное окно
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://rozetka.com.ua/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='header__button ng-star-inserted'])[1]")).click();
        driver.findElement(By.id("auth_email")).sendKeys("Text");
        driver.findElement(By.id("auth_pass")).sendKeys("1223354");
        driver.findElement(By.xpath("//label[@class='auth-modal__remember-checkbox']")).click();
        System.out.println(driver.findElement(By.xpath("//button[@class='auth-modal__register-link button button--link ng-star-inserted']")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='modal__close']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
