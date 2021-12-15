package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myWebDriver {
    private static WebDriver myWebDriver;

    public static void setMyWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/drivers/chromedriver.exe");
        myWebDriver = new ChromeDriver();
    }

    public static WebDriver getMyWebDriver() {
        if (myWebDriver == null) {
            setMyWebDriver();
        }
        return myWebDriver;
    }

}


