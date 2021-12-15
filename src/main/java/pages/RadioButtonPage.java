package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage {
    @FindBy(css = "[for='yesRadio']")
    private WebElement yesButton;
    @FindBy(css = "[for='impressiveRadio']")
    private WebElement impressiveButton;
    @FindBy(css = "[id='noRadio']")
    private WebElement noButton;
    @FindBy(css = "[class='mt-3']")
    private WebElement textSuccess;

    Helper helper = new Helper();

    public WebElement getYesButton() {
        return yesButton;
    }

    public WebElement getImpressiveButton() {
        return impressiveButton;
    }

    public WebElement getNoButton() {
        return noButton;
    }

    public void setYesButton() {
        if ((!isSelected(yesButton) && !isSelected(impressiveButton))
                || (!isSelected(yesButton) && isSelected(impressiveButton))) {
            helper.scrollIntoView(yesButton);
            yesButton.click();
        }
    }

    public void setImpressiveButton() {
        if ((!isSelected(yesButton) && !isSelected(impressiveButton))
                || (isSelected(yesButton) && !isSelected(impressiveButton))) {
            helper.scrollIntoView(impressiveButton);
            impressiveButton.click();
        }
    }

    public boolean isEnabled(WebElement element) {
        return element.isEnabled();
    }

    public boolean isSelected(WebElement element) {
        return element.isSelected();
    }

    public boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

}
