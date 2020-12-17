package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FhcLoginPage {
    public FhcLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "UserName")
    public WebElement usernameTextbox;

    @FindBy(id = "Password")
    public  WebElement passwordTextbox;

    @FindBy(id = "btnSubmit")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Try again please']")
    public WebElement errorMessage;

    @FindBy(xpath ="//span[.='Create a new account']" )
    public WebElement createButton ;


}
