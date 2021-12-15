package realTest;

import base.BaseTest;
import base.Helper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SonyCartPage;
import static org.testng.Assert.*;

public class addCartTest extends BaseTest {
    private SonyCartPage sonyCartPage;
    private Helper helper;

    @BeforeMethod
    public void setUp(){
        getDriver().get("http://live.techpanda.org/index.php/");
        sonyCartPage= PageFactory.initElements(getDriver(),SonyCartPage.class);
        helper=new Helper();
    }
    @Test(testName = "Check error message",priority = 0)
    public void isErrorMessageDisplayed(){
        String expectedErrorMessage="* The maximum quantity allowed for purchase is 500.";
        sonyCartPage.goToMobilePage()
                .setAddToCard()
                .setQtyField()
                .setUpdateButton();
        assertEquals(expectedErrorMessage,sonyCartPage.getErrorMessage());

    }
    @Test(testName = "Check card is empty",priority = 1)
    public void checkEmptyCard(){
        String expectedMessage="Shopping Cart is Empty";
        expectedMessage.toUpperCase();
        sonyCartPage.goToMobilePage()
                .setAddToCard()
                .setQtyField()
                .setUpdateButton()
                .setEmptyCartButton();
        assertEquals(expectedMessage,sonyCartPage.getShoppingCartContent());
    }
    @AfterClass
    public void tearDown(){
        getDriver().quit();
    }

}
