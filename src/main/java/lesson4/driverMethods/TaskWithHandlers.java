package lesson4.driverMethods;

import driverFactory.DriverSetUp;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class TaskWithHandlers {
     /*  Открыть в браузере три различные вкладки.
     На каждой вкладке открыть отдельно различные любые страницы,
     вывести в консоль названия открытых страниц. Закрыть браузер.*/
    public static void openLinkInANewTab(WebDriver driver, String url){
        Set<String> set1 = driver.getWindowHandles();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> set2 = driver.getWindowHandles();
        set2.removeAll(set1);
        String newDescriptor = set2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get(url);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://dan-it.com.ua/uk/");
        System.out.println(driver.getTitle());
        openLinkInANewTab(driver, "http://www.automationpractice.pl/index.php");
        System.out.println(driver.getTitle());
        openLinkInANewTab(driver,"https://www.rozetka.ua/");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        Set<String> handlers = driver.getWindowHandles();
        for (String handler: handlers){
            driver.switchTo().window(handler);
            if(driver.getCurrentUrl().equals("http://www.automationpractice.pl/index.php")){
                driver.close();
            }
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
