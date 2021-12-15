package realTest;

import base.BaseTest;
import base.Helper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import static org.testng.Assert.*;

public class RegistrationTest extends BaseTest {
    private RegistrationPage registrationPage;
    private Helper helper;

    @BeforeMethod
    public void setUp(){
        getDriver().get("http://live.techpanda.org/index.php/");
        registrationPage= PageFactory.initElements(getDriver(),RegistrationPage.class);
        helper=new Helper();
    }
    @Test(testName = "Verifying registration and share Wishlist")
    public void registrationTest(){
        final String firstName="Mher";
        final String lastName="Tangyan";
        final String email="mhertanryan123455@mail.ru";
        final String password="64376433";
        final String expectedMessage="Thank you for registering with Main Website Store.";
        final String shareEmail="mher@mill.com";
        final String shareMessage="This is ny wishlist";
        final String expectedSuccessMessage="Your Wishlist has been shared.";
        registrationPage.accountLinkClick()
                .myAccountClick()
                .setCreateAnAccount()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setConfirmationPassword(password)
                .setRegistrationButton();
        assertEquals(expectedMessage,registrationPage.getActualMessage());
        registrationPage.goToTvMenu()
                .setAddToWishlist()
                .setShareWishlist()
                .setShareEmail(shareEmail)
                .setShareMessage(shareMessage)
                .setSubmitButton();
        assertEquals(expectedSuccessMessage,registrationPage.successText());
    }
    @AfterClass
    public void tearDown(){
        getDriver().quit();
    }
}
