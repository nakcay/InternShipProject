package StepDefinitions;

import Pages.NurPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class NurSteps {

    NurPage pf = new NurPage();
    String path = "src/test/java/StepDefinitions/FieldsSheet.xlsx";
    FileInputStream inputStream = new FileInputStream(path);
    Workbook workbook = WorkbookFactory.create(inputStream);
    Sheet sheet = workbook.getSheet("Sheet1");
    Actions actions = new Actions(BasicDriver.getDriver());
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    public NurSteps() throws IOException {

    }
    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        BasicDriver.getDriver().get("https://test.mersys.io/");
        BasicDriver.getDriver().manage().window().maximize();

    }
    @When("Enter username and password")
    public void enter_username_and_password() {
       pf.sendKeysMethod(pf.getLoginUsername(), "turkeyts");
       pf.sendKeysMethod(pf.getLoginPassword(), "TechnoStudy123");

    }
    @When("Click on Login Button")
    public void click_on_login_button() {
        pf.getLoginBtn().click();
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        wait.until(ExpectedConditions.visibilityOf(pf.getDashBoardHeader()));
        Assert.assertTrue(pf.getDashBoardHeader().isDisplayed());
    }

        @And("I click on the set up")
        public void iClickOnTheSetUp () {
            pf.clickMethod(pf.getSetupBtn());

        }

        @And("I click on the parameters")
        public void iClickOnTheParameters () {
            pf.clickMethod(pf.getParameterBtn());

        }

        @And("I click on fields")
        public void iClickOnFields () {
            pf.clickMethod(pf.getFieldsBtn());

        }

        @And("I click on the add button")
        public void iClickOnTheAddButton () {
            pf.clickMethod(pf.getAddFields());
        }

        @And("fill up the new field form")
        public void fillUpTheNewFieldForm () {
            Row row = sheet.getRow(0);
            pf.sendKeysMethod(pf.getInputName(), String.valueOf(row.getCell(0)));
            pf.sendKeysMethod(pf.getInputCode(), String.valueOf(row.getCell(1)));

        }

        @And("I click on the save button")
        public void iClickOnTheSaveButton () {
            pf.clickMethod(pf.getSaveBtn());
        }

        @Then("user should see the success message about adding new field")
        public void userShouldSeeTheSuccessMessageAboutAddingNewField () {
            pf.wait.until(ExpectedConditions.invisibilityOf(pf.getSuccessMessage()));
            pf.verifyContainsText(pf.getSuccessMessage(), "success");

        }


        @And("I input a data in search name box")
        public void iInputADataInSearchNameBox () {
            Row row = sheet.getRow(0);
            pf.sendKeysMethod(pf.getInputNameSearchBox(), String.valueOf(row.getCell(0)));
        }

        @And("click on search button")
        public void clickOnSearchButton () {
            pf.clickMethod(pf.getSearchBtn());
        }

        @And("I click edit button of a field that I want to edit")
        public void iClickEditButtonOfAFieldThatIWantToEdit () {
            pf.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("svg[data-icon='pen-to-square']"), 10));
            pf.clickMethod(pf.getEditBtn());
        }

        @And("I Change the code")
        public void iChangeTheCode () {
            Action code = actions.sendKeys(Keys.TAB).build();
            code.perform();
            pf.wait(3);
            pf.getInputCode().clear();
            Row row1 = sheet.getRow(1);
            pf.sendKeysMethod(pf.getInputCode(), String.valueOf(row1.getCell(1)));
        }

        @Then("user should see the success message about editing new field")
        public void userShouldSeeTheSuccessMessageAboutEditingNewField () {
            pf.wait.until(ExpectedConditions.invisibilityOf(pf.getSuccessMessage()));
            pf.verifyContainsText(pf.getSuccessMessage(), "success");

        }


        @And("I send a created field name that i want to delete to the search box")
        public void iSendACreatedFieldNameThatIWantToDeleteToTheSearchBox () {
            Row row = sheet.getRow(0);
            pf.sendKeysMethod(pf.getInputNameSearchBox(), String.valueOf(row.getCell(0)));
        }

        @And("I click on the delete button")
        public void iClickOnTheDeleteButton () {
            pf.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("svg[data-icon='trash-can']"), 10));
            pf.clickMethod(pf.getDeleteBtn());
        }

        @And("I click on the warning delete")
        public void iClickOnTheWarningDelete () {
            pf.clickMethod(pf.getDeleteConfirmationBtn());
        }

        @Then("user should see the success message about deleting a field")
        public void userShouldSeeTheSuccessMessageAboutDeletingAField () {
            pf.wait.until(ExpectedConditions.invisibilityOf(pf.getSuccessMessage()));
            pf.verifyContainsText(pf.getSuccessMessage(), "success");

        }

        @And("fill up the new field form with already created name")
        public void fillUpTheNewFieldFormWithAlreadyCreatedName () {
            Row row = sheet.getRow(2);
            pf.sendKeysMethod(pf.getInputName(), String.valueOf(row.getCell(0)));

        }

        @Then("user should see the Warning message about adding new field")
        public void userShouldSeeTheWarningMessageAboutAddingNewField () {
            pf.wait.until(ExpectedConditions.invisibilityOf(pf.getWarningMessage()));
            pf.verifyContainsText(pf.getWarningMessage(), "already");


        }


        @And("I click on inactive save button")
        public void iClickOnInactiveSaveButton () {
            pf.clickMethod(pf.getInactiveSaveBtn());
        }

        @Then("user should see the name placeholder in red")
        public void userShouldSeeTheNamePlaceholderInRed () {
            Assert.assertEquals(pf.getNamePlaceHolder().getCssValue("color"), "rgba(0, 0, 0, 0.87)");

        }
    }
