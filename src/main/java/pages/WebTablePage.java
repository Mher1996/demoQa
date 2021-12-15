package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage {
    @FindBy(css = "[id='addNewRecordButton']")
    private WebElement addButton;
    @FindBy(css = "[id='firstName']")
    private WebElement firstName;
    @FindBy(css = "[id='lastName']")
    private WebElement lastName;
    @FindBy(css = "[id='userEmail']")
    private WebElement userEmail;
    @FindBy(css = "[id='age']")
    private WebElement userAge;
    @FindBy(css = "[id='salary']")
    private WebElement salary;
    @FindBy(css = "[id='department']")
    private WebElement department;
    @FindBy(css = "[id='submit']")
    private WebElement submitButton;

    Helper helper=new Helper();

    public void setAddButton(){
        helper.scrollIntoView(addButton);
        addButton.click();
    }
    public WebTablePage setFirstName(String fName){
        firstName.click();
        firstName.sendKeys(fName);
        return this;
    }
    public WebTablePage setLastSame(String lName){
        lastName.click();
        lastName.sendKeys(lName);
        return this;
    }
    public WebTablePage setUserEmail(String uEmail){
        userEmail.click();
        userEmail.sendKeys(uEmail);
        return this;
    }
    public WebTablePage setUserAge(int uAge){
        userAge.click();
        userAge.sendKeys(String.valueOf(uAge));
        return this;
    }
    public WebTablePage setSalary(int uSalary){
        salary.click();
        salary.sendKeys(String.valueOf(uSalary));
        return this;
    }
    public WebTablePage setDepartment(String uDepartment){
        department.click();
        department.sendKeys(uDepartment);
        return this;
    }
    public void submit(){
        submitButton.click();
    }
}
