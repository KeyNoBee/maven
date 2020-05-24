package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver){
       super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a" )
    private WebElement singUp;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
    private WebElement login;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
    private WebElement shoppingCart;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[2]")
    private  WebElement search;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[1]")
    private WebElement searchField;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")
    private WebElement psswd;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")
    private WebElement email;








    public void singUpClick(){

        singUp.click();
    }
    public void loginClick(){

        login.click();
    }
    public void shoppingCartClick(){

        shoppingCart.click();
    }
    public void searchClick(){

        search.click();
    }
    public void searchField(){

        searchField.sendKeys();
    }
    public void psswdField(String password){
        psswd.sendKeys();
    }
    public void emailField(String email){

        this.email.sendKeys();
    }



}
