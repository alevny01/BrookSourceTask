package Test.stepDefinitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Test.utilities.Driver;

public class Hooks {

    @Before
    public void setUp(){

        System.out.println("-->SETUP SUCCESSFULLY");
    }


    @After
    public void tearDown(Scenario scenario){
        System.out.println("-->SUCCESSFULLY TEAR DOWN");

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        Driver.closeDriver();
    }

}

