package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskForLesson5 {

        /*Написать три метода.
    1) Метод, возвращающий WebElement и принимающий в параметры его локатор.
    2) Метод, который будет кликать на элемент, локатор которого будет передан в параметр метода
    3) Метод, который будет отправлять текст в элемент. В параметры метода передается локатор и текст.
    */

    public static void clickOnElement(By locator, WebDriver driver) {
        driver.findElement(locator).click();

    }

    public static WebElement findMyElement(By locator, WebDriver driver) {
        return driver.findElement(locator);

    }

    public static void sendTextToElement(String text, By locator, WebDriver driver) {
        driver.findElement(locator).sendKeys(text);
    }
}
