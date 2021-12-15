package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileMenuPage {
    @FindBy(xpath = "//*[@id='product-price-1']/span")
    private WebElement sonyPrice;
    @FindBy(css = "[class='level0 nav-1 first active'] a")
    private WebElement mobileMenu;

    Helper helper = new Helper();

    public void toMobileMenu() {
        helper.scrollIntoView(mobileMenu);
        mobileMenu.click();
    }

    public String getSonyPrice() {
        return sonyPrice.getText();
    }

}
