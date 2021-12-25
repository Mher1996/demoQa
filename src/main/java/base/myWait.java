package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myWait {
    private static WebDriverWait myWebDriverWait;

    public static WebDriverWait getMyWebDriverWait() {
        if (myWebDriverWait == null) {
            myWebDriverWait = new WebDriverWait(myWebDriver.getMyWebDriver(), 30, 2000);
        }
        return myWebDriverWait;
    }



}


