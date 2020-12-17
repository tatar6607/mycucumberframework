package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationPage {
    public AutomationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement siginButton;

    @FindBy(id = "email_create")
    public WebElement createAccountEmailTextbox;

    @FindBy(xpath = "//i[@class='icon-user left']")
    public  WebElement createAccountButton;

    @FindBy(id = "uniform-id_gender1")
    public WebElement genderRadioButton;

    @FindBy(id = "customer_firstname")
    public WebElement firstname1;

    @FindBy(id="customer_lastname")
    public WebElement lastname1;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "passwd")
    public WebElement passwordTextBox;

    @FindBy(id = "days")
    public WebElement daysDropDown;

    @FindBy(id = "months")
    public WebElement monthsDropDown;

    @FindBy(id="years")
    public WebElement yearsDropDown;

    @FindBy(id = "firstname")
    public  WebElement firstname2;

    @FindBy(id = "lastname")
    public WebElement lastname2;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement stateDropDown;

    @FindBy(id = "postcode")
    public  WebElement postcode;

    @FindBy(id = "id_country")
    public WebElement countryDropDown;

    @FindBy(id = "other")
    public WebElement noteTextBox;

    @FindBy(id = "phone")
    public WebElement homePhone;

    @FindBy(id = "phone_mobile")
    public  WebElement mobilePhone;

    @FindBy(id = "alias")
    public WebElement aliasName;

    @FindBy(xpath = "//*[contains(text(),'Register')]")  //span[.='Register']
    public WebElement register;

    @FindBy(xpath = "//h1[@class='page-heading']")
    public WebElement myAccount;

    @FindBy(xpath = "//div[@class='header_user_info']")
    public WebElement accountName;

    @FindBy(id = "email")
    public WebElement emailTextBox2;

    @FindBy(id = "passwd")
    public WebElement passwordTextBox2;

    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;

    @FindBy(xpath = "//*[contains(text(),'Authentication ')]")
    public WebElement errorMessage;

    @FindBy(xpath = "(//a[@title='Women'])[1]")
    public WebElement woman;

    @FindBy(xpath = "//a[.='T-shirts']")
    public WebElement tShirt;

    @FindBy(xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[2]")
    public WebElement product1;

    @FindBy(id = "search_query_top")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[contains(text(),'Faded Short Sleeve T-shirts')])[3]")
    public WebElement product2;

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dressesLink;

    @FindBy(xpath = "//span[@itemprop='price']")//div[@class='product-image-container']
    public List<WebElement> allProductPrice;

    @FindBy(xpath = " //*[@id=\"center_column\"]//a[@class='product-name']")
    public List<WebElement> allProductName;





}
