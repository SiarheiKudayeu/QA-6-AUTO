package lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
    static void acceptCookies(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        WebElement acceptCookies = driver.findElement(By.id("ez-accept-all"));
        acceptCookies.click();
        Thread.sleep(5000);
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //xpath
        //tagName[@attributeName = 'valueOfAttribute']
   /*     driver.get("https://www.guinnessworldrecords.com/account/register?ReturnUrl=%2Faccount");
        acceptCookies(driver);
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Good xpath");
        */
        //xpath with text
  /*      driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        acceptCookies(driver);
        driver.findElement(By.xpath("//*[text()='Standard application']")).click();*/
        //*[text()='Standard application']     - по всему тексту
        //a[contains(text(), 'now')]           - по части  текста
        //a[contains(@href, '=%2faccount')]    - по части значения атрибута

        //combine xpath
        //input[@type='text'][@id='Username']
 /*       driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        acceptCookies(driver);
        driver.findElement(By.xpath("//div[contains(@class,'block block-4-12')][not(contains(@class,'columned'))]")).click();
*/
        /*
 // /.. - вверх по тегу
 /имя_тега вниз к указанному тегу
 переход на родительский тег /parent::div
 переход на дочерний тег /child::a
 переход на параллельный тег /following-sibling::*[1]
 предок /ancestor::span
 потомок /descendant::h3
        */


         // (//a[@href='/records/apply-to-set-or-break-a-record'])[2]/../following-sibling::div[3]/a
//ключевое слово last()
  /*      driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        acceptCookies(driver);
        driver.findElement(By.xpath("(//a[@href='/records/apply-to-set-or-break-a-record'])[2]/../following-sibling::div[last()]/a")).click();
*/
        //xpath операторы >, <, >=, <=, !=
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        acceptCookies(driver);
        driver.findElement(By.xpath("//input[@data-val-length-max>100]")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@data-val-length-max!=255]")).sendKeys("def");
        driver.findElement(By.id("RememberMe")).click();

    }
}
