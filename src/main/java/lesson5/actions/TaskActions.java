package lesson5.actions;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskActions {
           /*
        Открыть страницу https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/
        навести курсор на "RECORDS", навести курсор на "APPLY TO SET OR BREAK A RECORD", открыть "Standard Applications"
        в новой вкладке. Перейти на новую вкладку и вывести в консоль название страницы.
        */

    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        try {
            driver.findElement(By.id("ez-accept-all")).click();
        } catch (Exception e) {
            System.out.println("Нет кнопки \"accept-all\"");
        }
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[@href='/records/']")))
                .moveToElement(driver.findElement(By.xpath("//a[@href='/records/apply-to-set-or-break-a-record/']")))
                .keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()='Standard Applications']")))
                .keyUp(Keys.CONTROL).build().perform();
    }
}
