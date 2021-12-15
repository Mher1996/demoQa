package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementTextBoxPage {
    @FindBy(css = "[id='userName']")
    private WebElement userName;
    @FindBy(css = "[id='userEmail']")
    private WebElement userEmail;
    @FindBy(css = "[id='currentAddress']")
    private WebElement currentAddress;
    @FindBy(css = "[id='permanentAddress']")
    private WebElement permanentAddress;
    @FindBy(css = "[id='submit']")
    private WebElement submitButton;



    //-------------------------------------
    @FindBy(css = "[id='output']")
    private WebElement output;
    @FindBy(css = "[id='name']")
    private WebElement nameOutput;
    @FindBy(css = "[id='email']")
    private WebElement emailOutput;

    Helper helper=new Helper();

    public void scrollToOutput(){
        helper.scrollIntoView(output);
    }

    public boolean isEmailErrorDisplayed(){
        return userEmail.getAttribute("class").contains("field-error");
    }
    public String getNameOutput(){
        return nameOutput.getText().split(":")[1];
    }
    public String getEmailOutput(){
        return emailOutput.getText().split(":")[1];
    }

    public ElementTextBoxPage setUserName(String userNameText ){
        helper.scrollIntoView(userName);
        userName.click();
        userName.sendKeys(userNameText);
        return this;
    }
    public ElementTextBoxPage setUserEmail(String UserEmailText){
        helper.scrollIntoView(userEmail);
        userEmail.click();
        userEmail.sendKeys(UserEmailText);
        return this;
    }
    public ElementTextBoxPage setCurrentAddress(String currentAddressText){
        helper.scrollIntoView(currentAddress);
        currentAddress.click();
        currentAddress.sendKeys(currentAddressText);
        return this;
    }
    public ElementTextBoxPage setPermanentAddress(String permanentAddressText){
        helper.scrollIntoView(permanentAddress);
        permanentAddress.click();
        permanentAddress.sendKeys(permanentAddressText);
        return this;
    }
    public void submitButton(){
        submitButton.click();
    }

}
