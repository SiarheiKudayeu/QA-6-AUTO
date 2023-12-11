package lesson6.tasks;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDropTask2 {
          /*
        На сайте https://www.ibuongiorno.com/about сделать скрол страницы с лева на право,
        до оончания возможных перелистываний страниц. Используя метод DragNDrop.
        */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.ibuongiorno.com/about");
        Thread.sleep(5000);
        Actions actions = new Actions(driver);

        for (int i = 0; i < 3; i++) {
            actions.moveToElement(driver.findElement(By.xpath("//a[@href='/contacts']")), 0, 50)
                    .clickAndHold().moveToElement(driver.findElement(By.cssSelector(".c-header__logo")), 0, 50)
                    .release().build().perform();
            Thread.sleep(1500);
        }
    }
}
