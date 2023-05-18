package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div/div[1]/button[2]")
    WebElement logoutPage;

    public void ClickLogout(){
        logoutPage.click();
    }

    public LogoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
