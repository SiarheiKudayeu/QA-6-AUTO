package lesson3;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task2 {
    //На сайте http://www.automationpractice.pl/  в поисковике набрать iPhone 11, нажать кнопку поиск.
    // Вывести в консоль инфомацию о том, содержит ли заголовок на странице резултатов поиска
    // искомое слово iPhone 11.

        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = DriverSetUp.setUpDriver();
            driver.manage().window().maximize();
            driver.get("http://www.automationpractice.pl/");
            String inputForSearch = "iPhone 11";
            driver.findElement(By.xpath("(//input[@type ='text'])[1]")).sendKeys(inputForSearch);

            driver.findElement(By.xpath("(//button[@type ='submit'])[1]")).click();
            Thread.sleep(3000);
            String resultSearchText = driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();

            boolean contains = resultSearchText.contains(inputForSearch);
            if(contains){
                System.out.println("Search works correct!");
            } else {
                System.out.println("Search is not working :(");
            }
            driver.quit();
        }
    }

