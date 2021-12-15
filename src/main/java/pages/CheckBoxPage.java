package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckBoxPage {
    @FindBy(css = "[class='rct-icon rct-icon-expand-all']")
    private WebElement expandAll;
    @FindBy(css = "[class='rct-icon rct-icon-collapse-all']")
    private WebElement collapseAll;
    @FindBy(css = "[class='rct-checkbox'] svg")
    private List<WebElement> checkBoxes;
    @FindBy(css = "[class='rct-icon rct-icon-expand-open']")
    private List<WebElement> chevronOpen;
    @FindBy(css = "[class='rct-icon rct-icon-expand-close']")
    private List<WebElement> chevronClose;

    Helper helper=new Helper();
    public List<WebElement> getCheckBoxes(){
        return checkBoxes;
    }

    public void expandAll(){
        helper.scrollIntoView(expandAll);
        expandAll.click();
    }
    public void collapseAll(){
        helper.scrollIntoView(collapseAll);
        collapseAll.click();
    }
    public void checkUncheckedBoxes(int index){
    WebElement checkBox=checkBoxes.get(index);
    helper.scrollIntoView(checkBox);
    checkBox.click();
    }
    public boolean isChecked (int index){
        String classAttributeText=checkBoxes.get(index).getAttribute("class");
        return classAttributeText.contains("check") && !classAttributeText.contains("half");
    }
    public boolean isHalfChecked(int index){
        return checkBoxes.get(index).getAttribute("class").contains("half");
    }
    public boolean areAllExpanded(){
        return chevronClose.size()==0;
    }
    public boolean areAllCollapsed(){
        return chevronOpen.size()==0;
    }

}
