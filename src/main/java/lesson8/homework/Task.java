package lesson8.homework;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task {

 /*2)Написать метод в параметры которого принимаются два ВебЭлемента.
 метод выводит в консоль информацию какой из двух элементов располагается
 выше на странице,какой из элементов располагается левее на странице,
 а также какой из элементов занимает большую площадь.Параметры метода могут
 также включать в себя другие аргументы, если это необходимо.
 */

    public static void elementarno(WebElement element1, WebElement element2) {
        if (element1.getLocation().y > element2.getLocation().y) {
            System.out.println("Element 2 is higher than Element 1");
        } else if (element1.getLocation().y < element2.getLocation().y) {
            System.out.println("Element 1 is higher than Element 2");
        } else {
            System.out.println("Elements are on same level");
        }

        if (element1.getLocation().x > element2.getLocation().x) {
            System.out.println("Element 2 is lefter than Element 1");
        } else if (element1.getLocation().x < element2.getLocation().x) {
            System.out.println("Element 1 is lefter than Element 2");
        } else {
            System.out.println("Elements are on same level");
        }

        if (element1.getSize().width * element1.getSize().height >
                element2.getSize().width * element2.getSize().height) {
            System.out.println("Element 1 square than Element 2");
        } else if (element1.getSize().width * element1.getSize().height <
                element2.getSize().width * element2.getSize().height) {
            System.out.println("Element 2 is lefter than Element 1");
        } else {
            System.out.println("Elements are the same");
        }


    }

    /*3)Написать метод который выводит сообщение об айди элемента,значении тэга элемента ,
значении класса элемента, значении атрибута name элемента, текста данного элемента,
а также о координатах центра контейнера данного элемента.*/

    public static void infoAboutElement(WebElement element){
        System.out.println(element.getAttribute("id"));
        System.out.println(element.getTagName());
    }


    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.guinnessworldrecords.com/search?term=%2A");
        elementarno(driver.findElement(By.id("search-button")),driver.findElement(By.id("search")) );
        infoAboutElement(driver.findElement(By.id("search-button")));
        driver.quit();
    }
}
