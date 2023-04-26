package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NurPage extends MyMethods {
    public NurPage(){
        PageFactory.initElements(BasicDriver.getDriver(),this);
    }
    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginUsername;
    @FindBy(css = "input[placeholder='Password']")
    private WebElement loginPassword;
    @FindBy(xpath = "//span[contains(text(),'LOGIN')]")
    private WebElement loginBtn;
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupBtn;
    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterBtn;
    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement fieldsBtn;
    @FindBy(css = "svg[data-icon='plus']")
    private WebElement addFields;
    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement inputName;
    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement inputCode;
    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveBtn;
    @FindBy(css = "input[data-placeholder='Name']")
    private WebElement inputNameSearchBox;
    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchBtn;
    @FindBy(css = "svg[data-icon='pen-to-square']")
    private WebElement editBtn;
    @FindBy(css = "svg[data-icon='trash-can']")
    private WebElement deleteBtn;
    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteConfirmationBtn;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;
    @FindBy(xpath = "//div[contains(text(),'already')]")
    private WebElement warningMessage;
    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement inactiveSaveBtn;
    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private  WebElement namePlaceHolder;
    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    private WebElement dashBoardHeader;

    public WebElement getDashBoardHeader() {
        return dashBoardHeader;
    }

    public WebElement getNamePlaceHolder() {
        return namePlaceHolder;
    }

    public WebElement getInactiveSaveBtn() {
        return inactiveSaveBtn;
    }

    public WebElement getWarningMessage() {
        return warningMessage;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getDeleteConfirmationBtn() {
        return deleteConfirmationBtn;
    }

    public WebElement getDeleteBtn() {
        return deleteBtn;
    }

    public WebElement getInputNameSearchBox() {
        return inputNameSearchBox;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }

    public WebElement getEditBtn() {
        return editBtn;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    public WebElement getFieldsBtn() {
        return fieldsBtn;
    }

    public WebElement getAddFields() {
        return addFields;
    }

    public WebElement getInputName() {
        return inputName;
    }

    public WebElement getInputCode() {
        return inputCode;
    }

    public WebElement getSetupBtn() {
        return setupBtn;
    }

    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getParameterBtn() {
        return parameterBtn;
    }
}
