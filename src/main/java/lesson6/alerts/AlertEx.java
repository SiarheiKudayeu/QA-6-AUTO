package lesson6.alerts;

import driverFactory.DriverSetUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertEx {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //button[@onclick='jsAlert()']
        //button[@onclick='jsConfirm()']
        //button[@onclick='jsPrompt()']

        // id = result

        String resultAlert = "You successfully clicked an alert";
        String resultConfirm = "You clicked: Cancel";
        String resultPrompt = "You entered: Qa";



        //ALERT_1
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(1000);
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();
        Thread.sleep(1000);
        boolean resultAlert1 = driver.findElement(By.id("result")).getText().equals(resultAlert);
        if(resultAlert1){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
        System.out.println("================");

        //ALERT_2
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(1000);
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.dismiss();
        Thread.sleep(1000);
        boolean resultAlert2 = driver.findElement(By.id("result")).getText().equals(resultConfirm);
        if(resultAlert2){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
        System.out.println("================");

        //ALERT_3
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(1000);
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        Thread.sleep(1000);
        alert3.sendKeys("Qa");
        Thread.sleep(1000);
        alert3.accept();
        boolean resultAlert3 = driver.findElement(By.id("result")).getText().equals(resultPrompt);
        if(resultAlert3){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
        System.out.println("================");


        driver.quit();


    }
}
