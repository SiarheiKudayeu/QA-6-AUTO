package lesson5.select;

import driverFactory.DriverSetUp;
import lesson5.TaskForLesson5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("http://ktokuda.net/");

        WebElement countriesWebElement = TaskForLesson5.findMyElement(By.id("itt_country"), driver);
        Select countries = new Select(countriesWebElement);

        //select
        countries.selectByVisibleText("Болгария");
        countries.selectByValue("61");
        countries.selectByIndex(3);


        //isMultiple
        System.out.println(countries.isMultiple());
        Select region = new Select(driver.findElement(By.id("region_list")));
        System.out.println(region.isMultiple());

        //getOptions
        countries.selectByVisibleText("Турция");
        Thread.sleep(1500);
        List<WebElement> regionList = region.getOptions();
        for (WebElement singleElement: regionList){
            System.out.println(singleElement.getText());
        }

        region.selectByVisibleText("Аланья");
        Thread.sleep(1500);
        region.selectByVisibleText("Анталия");
        Thread.sleep(1500);
        region.selectByVisibleText("Белек");
        Thread.sleep(1500);

        //deselect
        region.deselectByVisibleText("Анталия");
        Thread.sleep(1500);
        System.out.println("==================");
        List<WebElement> selectedRegions = region.getAllSelectedOptions();
        for (WebElement singleElement: selectedRegions){
            System.out.println(singleElement.getText());
        }
        //getFirstSelectedOption()

        //deselectAll()
        region.deselectAll();
        Thread.sleep(1500);
        driver.quit();


    }
}
