package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonePage {
@FindBy(css = "[class='level0 nav-1 first'] a")
    private WebElement mobileMenu;
@FindBy(css = "[title='Sony Xperia']")
    private WebElement sonyPhone;
@FindBy (css = "[class='price']")
    private WebElement phonePriceFromPage;
  Helper helper =new Helper();

  public void goToSonyPage(){
      helper.scrollIntoView(sonyPhone);
      sonyPhone.click();
  }
  public String getPriceFromPage(){
      return phonePriceFromPage.getText();
  }
}
