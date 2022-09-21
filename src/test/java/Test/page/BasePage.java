package Test.page;

import org.openqa.selenium.support.PageFactory;
import Test.utilities.ConfigurationReader;
import Test.utilities.Driver;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(), this);




    }
    public static void navigateToPage(){

        String pageURL = ConfigurationReader.getProperty("page.url");
        Driver.getDriver().get(pageURL);
    }




}
