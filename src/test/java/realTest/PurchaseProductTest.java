package realTest;

import base.BaseTest;
import base.Helper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ProductDeliveryPage;
import pages.PurchaseProductPage;
import pages.RegistrationPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class PurchaseProductTest extends BaseTest {
    private RegistrationPage registrationPage;
    private PurchaseProductPage purchaseProductPage;
    private ProductDeliveryPage productDeliveryPage;
    private Helper helper;

    @BeforeMethod
    public void setUp() throws Exception{
        getDriver().get("http://live.techpanda.org/index.php/");
        registrationPage= PageFactory.initElements(getDriver(), RegistrationPage.class);
        purchaseProductPage=PageFactory.initElements(getDriver(),PurchaseProductPage.class);
        productDeliveryPage=PageFactory.initElements(getDriver(),ProductDeliveryPage.class);
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        helper=new Helper();
    }
    @Test(testName = "Purchase product")
    public void purchaseProduct() throws Exception{
        final String emailText="mhermho@mail.ru";
        final String passwordText="123456789";
        final String addressText="ABC";
        final String cityText="San Francisco";
        final String zipCodeText="542896";
        final String phoneNumberText="12345678";
        final String expectedFlatRate="Fixed - $5.00";
        final String expectedPurchaseSuccessMessage="YOUR ORDER HAS BEEN RECEIVED.";
        registrationPage.accountLinkClick()
                .myAccountClick();
        purchaseProductPage.setAccountEmail(emailText)
                .setAccountPassword(passwordText)
                .setLogin()
                .toMyWishlist()
                .addToCart()
                .setRegion()
                .setZipCode(zipCodeText)
                .estimateButtonClick();
        assertEquals(expectedFlatRate,purchaseProductPage.getFixedFlat());
        purchaseProductPage.updateButtonClick()
                .proceedToCheckoutClick();
        productDeliveryPage.setDeliveryAddress(addressText)
                .setDeliveryCity(cityText)
                .selectRegion()
                .setPhoneNumber(phoneNumberText)
                .setZipCode(zipCodeText)
                .setContinueButton()
                .setContinueButtonShippingMethod()
                .selectPaymentMethod()
                .setPaymentContinue()
                .placeOrderClick();
        System.out.println("Your order number for your record =" + purchaseProductPage.getOrderNumber());



    }
    @AfterClass
    public void tearDown(){
        getDriver().quit();
    }

}
