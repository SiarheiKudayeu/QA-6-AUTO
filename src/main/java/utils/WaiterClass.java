package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class WaiterClass {
    private final WebDriver driver;
    private static final long EXPLICIT_WAIT = 10L;

    public WaiterClass(WebDriver driver) {
        this.driver = driver;
    }

    private FluentWait<WebDriver> fluentWait(Long  duration){
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(duration))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(InvalidElementStateException.class);
    }

    private void waitForFunction(Function function, Long timeOutInSeconds) {
        FluentWait<WebDriver> wait = fluentWait(timeOutInSeconds);
        wait.until(function);
    }

    public WebElement waitForVisabilityOfWebElement(By locator){
        return fluentWait(EXPLICIT_WAIT).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
