package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReorderPage {
    @FindBy(css = "[class='a-center view last'] [class='link-reorder']")
    private WebElement reorderLink;
    @FindBy(css = "[class='input-text qty']")
    private WebElement qtyField;
    @FindBy(css = "[class='button btn-update']")
    private WebElement updateButton;
    @FindBy(xpath = "//*[@id='shopping-cart-totals-table']/tfoot/tr/td[2]")
    private WebElement grantTotal;
    @FindBy(css = "[onclick='billing.save()']")
    private WebElement continueButton;
    @FindBy(css = "[onclick='shippingMethod.save()']")
    private WebElement shippingMethodContinue;
    @FindBy(css = "[class='method-checkout-cart-methods-onepage-bottom'] [class='button btn-proceed-checkout btn-checkout']")
    private WebElement proceedToCheckout;


    Helper helper = new Helper();

    public ReorderPage proceedToCheckoutClick(){
        helper.scrollIntoView(proceedToCheckout);
        proceedToCheckout.click();
        return this;
    }

    public ReorderPage continueButtonClick() {
        helper.scrollIntoView(continueButton, false);
        continueButton.click();
        return this;
    }

    public ReorderPage shippingMethodContinueButton() {
        helper.scrollIntoView(shippingMethodContinue, false);
        shippingMethodContinue.click();
        return this;
    }

    public String getGrantTotal() {
        return grantTotal.getText();
    }

    public ReorderPage reorderLinkClick() {
        helper.scrollIntoView(reorderLink, false);
        reorderLink.click();
        return this;
    }

    public ReorderPage setQty(String qtyText) {
        helper.scrollIntoView(qtyField, false);
        qtyField.click();
        qtyField.clear();
        qtyField.sendKeys(qtyText);
        return this;
    }

    public ReorderPage clickUpdateButton() {
        helper.scrollIntoView(updateButton, false);
        updateButton.click();
        return this;
    }


}
