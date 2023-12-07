package lesson4.webElement;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementEx {

    public static int getCentreX(WebElement element){
        return element.getLocation().x + element.getSize().width/2;
    }

    public static int getCentreY(WebElement element){
        return element.getLocation().y + element.getSize().height/2;
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.guinnessworldrecords.com/search");
     /*   WebElement searchField = driver.findElement(By.id("search-term"));
        searchField.sendKeys("text");
        searchField.sendKeys(Keys.ENTER);
        searchField.clear();
        searchField.sendKeys("one more");
        driver.navigate().refresh();
        searchField = driver.findElement(By.id("search-term"));
        searchField.sendKeys("keys");
        Thread.sleep(3000);*/

        WebElement searchButton = driver.findElement(By.id("search-button"));
  /*      System.out.println(searchButton.getText());
        System.out.println(searchButton.getTagName());
        System.out.println(searchButton.getAttribute("class"));
        System.out.println(searchButton.getAttribute("id"));
        System.out.println(searchButton.getCssValue("background-color"));
        System.out.println(searchButton.getCssValue("min-height"));*/

        WebElement searchLink = driver.findElement(By.id("search"));

 /*       System.out.println("Размер вашей кнопки " + searchButton.getSize());
        System.out.println("Размер вашей кнопки " + searchLink.getSize());

        System.out.println("Ширина кнопки " + searchButton.getSize().width);
        System.out.println("Высота кнопки " + searchButton.getSize().height);*/

        System.out.println("Coordinates of element " + searchButton.getLocation());
        System.out.println("Coordinates of element " + searchLink.getLocation());

        System.out.println("Coordinate x of element" + searchButton.getLocation().x);
        System.out.println("Coordinate y of element" + searchButton.getLocation().y);

        System.out.println("Размер вашей кнопки " + searchButton.getSize());

        System.out.println(getCentreX(searchButton));
        System.out.println(getCentreY(searchButton));

        driver.quit();


    }
}
