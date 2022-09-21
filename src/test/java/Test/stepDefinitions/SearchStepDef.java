package Test.stepDefinitions;

import Test.utilities.BrowserUtil;
import Test.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Test.page.BasePage;
import Test.page.SearchPage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchStepDef  {

    SearchPage page = new SearchPage();



    @Given("user navigates to job search page")
    public void user_navigates_to_job_search_page() {
    BasePage.navigateToPage();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(page.findWork).perform();
        page.positionLink.click();


    }
    @When("user search for job using keywords {string}")
    public void user_search_for_job_using_keywords(String text) {

        page.searchBox.sendKeys(text + Keys.ENTER);

    }
    @Then("user should be able to see the job positions")
    public void user_should_be_able_to_see_the_job_positions() {

     String expectedPosName = "IT Performance Tester";
     String actualPosName = page.jobPositionName.getText();

        System.out.println("actualPosName = " + actualPosName);
        Assert.assertEquals(expectedPosName,actualPosName);


      Driver.getDriver().quit();
    }


















}
