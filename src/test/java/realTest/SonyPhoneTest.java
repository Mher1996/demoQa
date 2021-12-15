package realTest;

import base.BaseTest;
import base.Helper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MobileMenuPage;
import pages.PhonePage;
import static org.testng.Assert.*;

public class SonyPhoneTest extends BaseTest {

    private MobileMenuPage mobileMenuPage;
    private PhonePage phonePage;
    private Helper helper;


    @BeforeClass
    public void setUp(){
        getDriver().get("http://live.techpanda.org/index.php/");
    mobileMenuPage= PageFactory.initElements(getDriver(),MobileMenuPage.class);
    phonePage=PageFactory.initElements(getDriver(),PhonePage.class);
    helper=new Helper();
    }
    @Test(testName = "Sony phone price")
    public void sonyPhonePriceTest(){
        String priceInMobileMenu;
        String priceFromSonyPage;
        mobileMenuPage.toMobileMenu();
        priceInMobileMenu=mobileMenuPage.getSonyPrice();
        phonePage.goToSonyPage();
        priceFromSonyPage= phonePage.getPriceFromPage();
        assertEquals(priceInMobileMenu,priceFromSonyPage);

    }

    //henc poisk tam kino Elelni mot beri Simba
    //comment ai
    @AfterClass
    public void tearDown(){
        getDriver().quit();
    }
}
