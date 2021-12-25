package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class Helper {
    public void scrollIntoView(WebElement element ,boolean alignToTop) {
        ((JavascriptExecutor) myWebDriver.getMyWebDriver()).executeScript("arguments[0].scrollIntoView("+alignToTop+")", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void scrollIntoView(WebElement element ) {
        ((JavascriptExecutor) myWebDriver.getMyWebDriver()).executeScript("arguments[0].scrollIntoView()", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

