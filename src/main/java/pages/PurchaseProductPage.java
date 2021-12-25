package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PurchaseProductPage {
    @FindBy(xpath = "//*[@id='top']/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a")
    private WebElement wishlistLink;
    @FindBy(css = "[class='cart-cell'] [title='Add to Cart']")
    private WebElement addToCardButton;
    @FindBy(css = "[id='email']")
    private WebElement accountEmail;
    @FindBy(css = "[id='pass']")
    private WebElement accountPassword;
    @FindBy(css = "[id='send2']")
    private WebElement loginButton;
    @FindBy(css = "[class='method-checkout-cart-methods-onepage-bottom'] [title='Proceed to Checkout']")
    private WebElement proceedToCheckoutButton;
    @FindBy(css = "[id='region_id']")
    private WebElement region;
    @FindBy(css = "[id='postcode']")
    private WebElement zipCode;
    @FindBy(css = "[for='s_method_flatrate_flatrate']")
    private WebElement flatFixed;
    @FindBy(css = "[class='page-title']")
    private WebElement checkout;
    @FindBy(css = "[onclick='coShippingMethodForm.submit()']")
    private WebElement estimateButton;
    @FindBy(css = "[id='s_method_flatrate_flatrate']")
    private WebElement flatRateRadioButton;
    @FindBy(css = "[value='Update Total']")
    private WebElement updateButton;
    @FindBy(xpath = "//*[@id='top']/body/div/div/div[2]/div/div/div[1]")
    private WebElement successMessage;
    @FindBy(xpath = "//*[@id='top']/body/div/div/div[2]/div/div/p[1]/a")
    private WebElement orderNumber;

    Helper helper = new Helper();

    public PurchaseProductPage setAccountEmail(String accountEmailText) {
        helper.scrollIntoView(accountEmail,false);
        accountEmail.click();
        accountEmail.sendKeys(accountEmailText);
        return this;
    }

    public PurchaseProductPage setAccountPassword(String accountPasswordText) {
        helper.scrollIntoView(accountPassword ,false);
        accountPassword.click();
        accountPassword.sendKeys(accountPasswordText);
        return this;
    }

    public PurchaseProductPage setLogin() {
        loginButton.click();
        return this;
    }

    public PurchaseProductPage toMyWishlist() {
        helper.scrollIntoView(wishlistLink,false);
        wishlistLink.click();
        return this;
    }

    public PurchaseProductPage addToCart() {
        helper.scrollIntoView(addToCardButton,false);
        addToCardButton.click();
        return this;
    }

    public PurchaseProductPage proceedToCheckoutClick() {
        helper.scrollIntoView(proceedToCheckoutButton,false);
        proceedToCheckoutButton.click();
        return this;
    }


    public PurchaseProductPage setRegion() {
        helper.scrollIntoView(region,false);
        Select select = new Select(region);
        select.selectByVisibleText("New Jersey");
        return this;
    }

    public PurchaseProductPage setZipCode(String zipCodeText) {
        helper.scrollIntoView(zipCode,false);
        zipCode.click();
        zipCode.clear();
        zipCode.sendKeys(zipCodeText);
        return this;
    }


    public PurchaseProductPage estimateButtonClick() {
        helper.scrollIntoView(estimateButton,false);
        estimateButton.click();
        return this;
    }

    public PurchaseProductPage updateButtonClick() {
        helper.scrollIntoView(flatRateRadioButton,false);
        flatRateRadioButton.click();
        helper.scrollIntoView(updateButton,false);
        updateButton.click();
        return this;
    }

    public String getFixedFlat() {
        return flatFixed.getText();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
    public String getOrderNumber(){
        return orderNumber.getText();
    }
}
