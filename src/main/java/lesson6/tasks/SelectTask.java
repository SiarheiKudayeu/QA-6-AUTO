package lesson6.tasks;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTask {
    /* На сайте http://ktokuda.net/ перейти на вкладку "Экскурсионные",
     выбрать следующие страны Бельгия Германия Греция, также необходимо тменить выбор первого
     элемента в списке, который выбирается автоматически.
     Из транспорта выбрать Автобус, из городов отправления Киев и Львов.
     Нажать кнопку "Найти".
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("http://ktokuda.net/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Экскурсионные']")).click();
        Select countries = new Select(driver.findElement(By.id("country_list")));
        countries.selectByVisibleText("Бельгия");
        countries.selectByVisibleText("Германия");
        countries.selectByVisibleText("Греция");
        Thread.sleep(1500);
        countries.deselectByVisibleText("Австрия");
        Thread.sleep(1500);
        Select transport = new Select(driver.findElement(By.id("transport_list")));
        Thread.sleep(2500);
        transport.selectByVisibleText("Автобус");
        Thread.sleep(1500);
        transport.deselectByVisibleText("Все виды");
        Thread.sleep(1500);
        Select city = new Select(driver.findElement(By.id("city_list")));
        Thread.sleep(3000);
        city.selectByVisibleText("Киев");
        city.selectByVisibleText("Львов");
        Thread.sleep(1500);
        city.deselectByVisibleText("Все города");
        Thread.sleep(1500);
        driver.findElement(By.xpath("(//input[@value='Найти'])[2]")).click();


    }


}
