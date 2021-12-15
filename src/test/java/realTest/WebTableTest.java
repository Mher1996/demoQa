package realTest;

import base.BaseTest;
import dataprovider.IndexDataProvider;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WebTablePage;

public class WebTableTest extends BaseTest {
    private WebTablePage webTablePage;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        getDriver().get("https://demoqa.com/webtables");
        webTablePage= PageFactory.initElements(getDriver(),WebTablePage.class);
    }
    @Test(testName = "Add new users",dataProvider = "nameDataProvider",dataProviderClass = IndexDataProvider.class)
    public void addUser(String names){
            webTablePage.setAddButton();
            webTablePage.setFirstName(names)
                    .setLastSame("Armyan")
                    .setUserEmail("armyan@mail.ru")
                    .setUserAge(15)
                    .setSalary(1000)
                    .setDepartment("Information security");
            webTablePage.submit();
    }
}
