package realTest;

import base.BaseTest;
import base.Helper;
import dataprovider.IndexDataProvider;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ElementTextBoxPage;

import static org.testng.Assert.*;

import java.util.UUID;

public class ElementsTestBox extends BaseTest {
    private ElementTextBoxPage elementTextBoxPage;
    private Helper helper;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        getDriver().get("https://demoqa.com/text-box");
        elementTextBoxPage = PageFactory.initElements(getDriver(), ElementTextBoxPage.class);
        helper = new Helper();
    }

    @Test(testName = "TextBox")
    public void elementsTest() {
        final String userName = "Sos Sagsyan";
        final String userEmail = "sos@gmail.com";
        final String currentAddress = "Ajapnyak 1";
        final String permanentAddress = "Lori " + UUID.randomUUID().toString();
        elementTextBoxPage.setUserName(userName)
                .setUserEmail(userEmail)
                .setCurrentAddress(currentAddress)
                .setPermanentAddress(permanentAddress);

        elementTextBoxPage.submitButton();
        elementTextBoxPage.scrollToOutput();

        assertEquals(elementTextBoxPage.getNameOutput(), userName);
        assertEquals(elementTextBoxPage.getEmailOutput(), userEmail);


    }
    @Test(testName = "Email validation",dataProvider = "EmailDataProvider",dataProviderClass =IndexDataProvider.class)
    public void emailValidation(String invalidEmail){
        elementTextBoxPage.setUserEmail(invalidEmail);
        elementTextBoxPage.submitButton();

        assertTrue(elementTextBoxPage.isEmailErrorDisplayed());
    }




}
