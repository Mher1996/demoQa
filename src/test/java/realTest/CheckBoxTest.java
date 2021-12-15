package realTest;

import base.BaseTest;
import base.Helper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

import java.util.Random;

import static org.testng.Assert.*;

public class CheckBoxTest extends BaseTest {

    private CheckBoxPage checkBoxPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        getDriver().get("https://demoqa.com/checkbox");
        checkBoxPage= PageFactory.initElements(getDriver(),CheckBoxPage.class);
    }
    @Test(testName = "Expanding and Collapsing")
    public void expandAndCollapse(){
        assertTrue(checkBoxPage.areAllCollapsed());
        checkBoxPage.expandAll();
        assertTrue(checkBoxPage.areAllExpanded());
        checkBoxPage.collapseAll();
        assertTrue(checkBoxPage.areAllCollapsed());

    }
    @Test(testName = "Is homeCheck checked")
    public void checkHalfCheck(){
        checkBoxPage.expandAll();
        int checkBoxIndex=new Random().nextInt(checkBoxPage.getCheckBoxes().size()-2)+1;
        checkBoxPage.checkUncheckedBoxes(checkBoxIndex);
        assertTrue(checkBoxPage.isChecked(checkBoxIndex));
        int indexOfHome=0;
        assertTrue(checkBoxPage.isHalfChecked(indexOfHome));

    }
    @Test(testName = "Select all")
    public void selectAll(){
        int indexOfHome=0;
        checkBoxPage.expandAll();
        checkBoxPage.checkUncheckedBoxes(indexOfHome);
        for (int i = 1; i < checkBoxPage.getCheckBoxes().size(); i++) {
            assertTrue(checkBoxPage.isChecked(i));
        }
        checkBoxPage.collapseAll();
        assertTrue(checkBoxPage.isChecked(indexOfHome));
    }
    @AfterClass
    public void tearDown(){
        getDriver().quit();
    }
}

