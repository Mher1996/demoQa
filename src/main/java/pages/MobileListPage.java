package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class MobileListPage {
    @FindBy(css = "[class='level0 nav-1 first'] a")
    private WebElement mobileMenu;
    @FindBy(css = "[title='Sort By']")
    private List<WebElement> sortingMenu;
    @FindBy(css = "[class='item last'] a [id]")
    private List<WebElement> phones;

    Helper helper=new Helper();

    public void toMobileMenu(){
        helper.scrollIntoView(mobileMenu);
        mobileMenu.click();

    }
    public void sortByNames(String sortValue) {
        Select drbMenu = new Select(sortingMenu.get(0));
        drbMenu.selectByVisibleText(sortValue);

    }
    public ArrayList<String> getNames(){
        ArrayList<String> phoneNames=new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
           String s =phones.get(i).getAttribute("alt");
           phoneNames.add(s);
        }
        return phoneNames;
    }

}
