package realTest;

import base.BaseTest;
import base.Helper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RadioButtonPage;

import static org.testng.Assert.*;

public class RadioButtonTest extends BaseTest {
    private RadioButtonPage radioButtonPage;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        getDriver().get("https://demoqa.com/radio-button");
        radioButtonPage = PageFactory.initElements(getDriver(), RadioButtonPage.class);

    }

    @Test(testName = "Select Yes button")
    public void selectYes() {
        radioButtonPage.setYesButton();
        assertTrue(radioButtonPage.isDisplayed(radioButtonPage.getYesButton())
                && !radioButtonPage.isSelected(radioButtonPage.getImpressiveButton()));

    }

    @Test(testName = "Select impressive button")
    public void selectImpressive() {
        radioButtonPage.setImpressiveButton();
        assertTrue(radioButtonPage.isDisplayed(radioButtonPage.getImpressiveButton())
                && !radioButtonPage.isSelected(radioButtonPage.getYesButton()));

    }

    @Test(testName = "No button is disabled")
    public void selectNo() {
        assertTrue(!radioButtonPage.isEnabled(radioButtonPage.getNoButton()));
    }

    @AfterClass
    public void tearDown() {
        getDriver().quit();
    }

}
