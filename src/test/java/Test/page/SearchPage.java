package Test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage{


    @FindBy(xpath = "//a[text()='Find Work ']")
    public WebElement findWork;


    @FindBy(xpath = "//*[text()='Seeking a Position'][1]")
    public WebElement positionLink;


    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[text()='IT Performance Tester']")
    public WebElement jobPositionName;
































}
