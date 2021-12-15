package realTest;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MobileListPage;
import static org.testng.Assert.*;

public class MobileListTest extends BaseTest {
    private MobileListPage mobileListPage;


    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        String url="http://live.techpanda.org/index.php/";
        getDriver().get(url);
        mobileListPage= PageFactory.initElements(getDriver(),MobileListPage.class);
    }
    @Test(testName = " Home Page Title ",priority = 0)
    public void homeTitleVerification(){
        final String expectedHomePageTitle="Home page";
        assertTrue(getDriver().getTitle().contains(expectedHomePageTitle));
    }
    @Test(testName = "Mobile menu page title",priority = 1)
    public void mobileMenuPageTitleVerification(){
        final String expectedMobileMenuPageTitle="Mobile";
        mobileListPage.toMobileMenu();
        assertTrue(getDriver().getTitle().contains(expectedMobileMenuPageTitle));
    }
    @Test(testName = "Sort by Name",priority = 2)
    public void sortByNames(){
        mobileListPage.toMobileMenu();
        mobileListPage.sortByNames("Name");

    }


}
