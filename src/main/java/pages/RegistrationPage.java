package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
    @FindBy(xpath = "//*[@id='header']/div/div[2]/div/a/span[2]")
    private WebElement account;
    @FindBy(css = "[id='header-account'] [class='links'] [class='first'] [title='My Account']")
    private WebElement myAccount;
    @FindBy(css = "[title='Create an Account']")
    private WebElement createAnAccount;
    @FindBy(css = "[id='firstname']")
    private WebElement firstName;
    @FindBy(css = "[id='lastname']")
    private WebElement lastName;
    @FindBy(css = "[id='email_address']")
    private WebElement email;
    @FindBy(css = "[id='password']")
    private WebElement password;
    @FindBy(css = "[id='confirmation']")
    private WebElement passwordConfirm;
    @FindBy(css = "[class='buttons-set'] [title='Register']")
    private WebElement registrationButton;
    @FindBy(css = "[class='success-msg']")
    private WebElement actualMessage;
    @FindBy(css = "[class='level0 nav-2 last'] [class='level0 ']")
    private WebElement tvMenu;
    @FindBy(xpath = "//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")
    private WebElement addToWishlist;
    @FindBy(css = "[name='save_and_share']")
    private WebElement shareWishlist;
    @FindBy(css = "[id='email_address']")
    private WebElement shareEmail;
    @FindBy(css = "[id='message']")
    private WebElement shareMessage;
    @FindBy(css = "[title='Share Wishlist']")
    private WebElement submitButton;
    @FindBy(css = "[class='success-msg']")
    private WebElement successMessage;


    Helper helper = new Helper();

    public RegistrationPage accountLinkClick() {
        helper.scrollIntoView(account,false);
        account.click();
        return this;
    }

    public RegistrationPage myAccountClick() {
        helper.scrollIntoView(myAccount,false);
        myAccount.click();
        return this;
    }

    public RegistrationPage setCreateAnAccount() {
        helper.scrollIntoView(createAnAccount);
        createAnAccount.click();
        return this;
    }

    public RegistrationPage setFirstName(String fistNameText) {
        helper.scrollIntoView(firstName);
        firstName.click();
        firstName.sendKeys(fistNameText);
        return this;
    }

    public RegistrationPage setLastName(String lastNameText) {
        helper.scrollIntoView(lastName);
        lastName.click();
        lastName.sendKeys(lastNameText);
        return this;
    }

    public RegistrationPage setEmail(String emailText) {
        helper.scrollIntoView(email);
        email.click();
        email.sendKeys(emailText);
        return this;
    }

    public RegistrationPage setPassword(String passwordText) {
        helper.scrollIntoView(password);
        password.click();
        password.sendKeys(passwordText);
        return this;

    }

    public RegistrationPage setConfirmationPassword(String passwordTextAgain) {
        helper.scrollIntoView(passwordConfirm);
        passwordConfirm.click();
        passwordConfirm.sendKeys(passwordTextAgain);
        return this;
    }

    public RegistrationPage setRegistrationButton() {
        helper.scrollIntoView(registrationButton);
        registrationButton.click();
        return this;
    }

    public String getActualMessage() {
        return actualMessage.getText();
    }
    public RegistrationPage goToTvMenu(){
        helper.scrollIntoView(tvMenu);
        tvMenu.click();
        return this;
    }
    public RegistrationPage setAddToWishlist(){
        helper.scrollIntoView(addToWishlist);
        addToWishlist.click();
        return this;
    }
    public RegistrationPage setShareWishlist(){
        helper.scrollIntoView(shareWishlist);
        shareWishlist.click();
        return this;
    }
    public RegistrationPage setShareEmail(String emailShareText){
        helper.scrollIntoView(shareEmail);
        shareEmail.click();
        shareEmail.sendKeys(emailShareText);
        return this;
    }
    public RegistrationPage setShareMessage(String shareMessageText){
        helper.scrollIntoView(shareMessage);
        shareMessage.click();
        shareMessage.sendKeys(shareMessageText);
        return this;
    }
    public RegistrationPage setSubmitButton(){
        helper.scrollIntoView(submitButton);
        submitButton.click();
        return this;
    }
    public String successText(){
        return successMessage.getText();
    }
}











