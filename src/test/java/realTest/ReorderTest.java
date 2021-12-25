package realTest;

import base.BaseTest;
import base.Helper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ProductDeliveryPage;
import pages.PurchaseProductPage;
import pages.RegistrationPage;
import pages.ReorderPage;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

public class ReorderTest extends BaseTest {
    private RegistrationPage registrationPage;
    private PurchaseProductPage purchaseProductPage;
    private ProductDeliveryPage productDeliveryPage;
    private ReorderPage reorderPage;
    private Helper helper;

    @BeforeMethod
    public void setUp(){
        getDriver().get("http://live.techpanda.org/index.php/");
        registrationPage= PageFactory.initElements(getDriver(),RegistrationPage.class);
        purchaseProductPage= PageFactory.initElements(getDriver(),PurchaseProductPage.class);
        productDeliveryPage= PageFactory.initElements(getDriver(),ProductDeliveryPage.class);
        reorderPage= PageFactory.initElements(getDriver(),ReorderPage.class);
        helper=new Helper();
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @Test(testName = "Reordering")
    public void reorder(){
        final String zipCodeText="542896";
        final String grantTotalBefore="$130.00";
        final String emailText="mhermho@mail.ru";
        final String passwordText="123456789";
        registrationPage.accountLinkClick()
                .myAccountClick();
        purchaseProductPage.setAccountEmail(emailText)
                .setAccountPassword(passwordText)
                .setLogin();

        reorderPage.reorderLinkClick()
                .setQty("5")
                .clickUpdateButton();
        purchaseProductPage.setRegion()
                .setZipCode(zipCodeText);
        assertNotEquals(grantTotalBefore,reorderPage.getGrantTotal());
        reorderPage.proceedToCheckoutClick()
                .continueButtonClick()
                .shippingMethodContinueButton();
        productDeliveryPage.selectPaymentMethod()
                .setPaymentContinue()
                .placeOrderClick();

        System.out.println("Your order number is  " + purchaseProductPage.getOrderNumber());



    }
    @AfterClass
    public void tearDown(){
        getDriver().quit();
    }

}
