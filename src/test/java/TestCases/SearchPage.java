package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/button[3]")
    WebElement clickOnCustomerBtn;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")
    WebElement clickOnSearchField;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[1]")
    WebElement welcomeText;


    public void ClickCustomerBtn(){
        clickOnCustomerBtn.click();
    }

    public void ClickSearchField(){
        clickOnSearchField.click();
    }

    public void EnterSearchField(String customer_name){
        clickOnSearchField.sendKeys(customer_name);
    }

    public String getWelcomeText() {
        return welcomeText.getText();
    }


    public SearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
