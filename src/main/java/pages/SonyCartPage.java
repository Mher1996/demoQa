package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;

public class SonyCartPage {
    @FindBy(css = "[class='level0 nav-1 first'] a")
    private WebElement mobileMenu;
    @FindBy(xpath = "//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button")
    private WebElement addToCardSony;
    @FindBy(css ="[class='input-text qty']" )
    private WebElement qtyField;
    @FindBy(css = "[class='button btn-update']")
    private WebElement updateButton;
    @FindBy(css = "[id='empty_cart_button']")
    private WebElement emptyCardButton;
    @FindBy(css = "[class='item-msg error']")
    private WebElement errorMessage;
    @FindBy(css = "[class='page-title']")
    private WebElement shoppingCartContent;
    Helper helper=new Helper();

    public SonyCartPage goToMobilePage(){
        helper.scrollIntoView(mobileMenu);
        mobileMenu.click();
        return this;
    }
    public SonyCartPage setAddToCard(){
        helper.scrollIntoView(addToCardSony);
        addToCardSony.click();
        return this;
    }
    public SonyCartPage setQtyField(){
        helper.scrollIntoView(qtyField);
        qtyField.click();
        qtyField.sendKeys("1000");
        return this;
    }
    public SonyCartPage setUpdateButton(){
        helper.scrollIntoView(updateButton);
        updateButton.click();
        return this;
    }
    public SonyCartPage setEmptyCartButton(){
        emptyCardButton.click();
        return this;
    }
    public String getErrorMessage(){
        return errorMessage.getText();
    }
    public String getShoppingCartContent(){
        return shoppingCartContent.getText().toUpperCase();
    }




}
