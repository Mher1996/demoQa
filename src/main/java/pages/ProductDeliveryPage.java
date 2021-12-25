package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductDeliveryPage {

    Helper helper=new Helper();

    @FindBy(css = "[id='billing:street1']")
    private WebElement address;
    @FindBy(css = "[id='billing:city']")
    private WebElement city;
    @FindBy(css = "[id='billing:region_id']")
    private WebElement region;
    @FindBy(css = "[id='billing:postcode']")
    private WebElement zipCode;
    @FindBy(css = "[id='billing:telephone']")
    private WebElement telephone;
    @FindBy(css = "[onclick='billing.save()']")
    private WebElement continueButton;
    @FindBy(css = "[onclick='shippingMethod.save()']")
    private WebElement continueButtonShippingMethod;
    @FindBy(css = "[id='p_method_checkmo']")
    private WebElement moneyOrderPaymentMethodRadioButton;
    @FindBy(css = "[onclick='payment.save()']")
    private WebElement paymentContinue;
    @FindBy(css = "[onclick='review.save();']")
    private WebElement placeOrder;

    public ProductDeliveryPage placeOrderClick(){
        helper.scrollIntoView(placeOrder,false);
        placeOrder.click();
        return this;
    }

    public ProductDeliveryPage setPaymentContinue(){
        helper.scrollIntoView(paymentContinue,false);
        paymentContinue.click();
        return this;
    }

    public ProductDeliveryPage selectPaymentMethod(){
        helper.scrollIntoView(moneyOrderPaymentMethodRadioButton,false);
        moneyOrderPaymentMethodRadioButton.click();
        return this;
    }


    public ProductDeliveryPage setContinueButtonShippingMethod() {
        helper.scrollIntoView(continueButtonShippingMethod,false);
        continueButtonShippingMethod.click();
        return this;
    }

    public ProductDeliveryPage setContinueButton() {
        helper.scrollIntoView(continueButton,false);
        continueButton.click();
        return this;
    }

    public ProductDeliveryPage setPhoneNumber(String phoneNumberText) {
        helper.scrollIntoView(telephone,false);
        telephone.click();
        telephone.clear();
        telephone.sendKeys(phoneNumberText);
        return this;
    }

    public ProductDeliveryPage setZipCode(String zipCodeText){
        helper.scrollIntoView(zipCode,false);
        zipCode.click();
        zipCode.clear();
        zipCode.sendKeys(zipCodeText);
        return this;
    }

    public ProductDeliveryPage selectRegion(){
        helper.scrollIntoView(region,false);
        Select select=new Select(region);
        select.selectByVisibleText("New York");
        return this;
    }

    public ProductDeliveryPage setDeliveryAddress(String addressText) {
        helper.scrollIntoView(address,false);
        address.click();
        address.clear();
        address.sendKeys(addressText);
        return this;
    }
    public ProductDeliveryPage setDeliveryCity(String cityText) {
        helper.scrollIntoView(city,false);
        city.click();
        city.clear();
        city.sendKeys(cityText);
        return this;
    }

}
