package lesson3;

import driverFactory.DriverSetUp;
import lesson2.Finalist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.setUpDriver();

        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        try {
            Finalist.acceptCookies(driver);
        } catch (Exception e){

        }
        List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='columned block block-4-12']/a"));
        for (WebElement element : webElementList) {
            System.out.println(element.getText());
        }

        driver.quit();
    }
}

