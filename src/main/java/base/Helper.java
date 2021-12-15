package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class Helper {
    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) myWebDriver.getMyWebDriver()).executeScript("arguments[0].scrollIntoView()", element);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

