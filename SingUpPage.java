package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingUpPage extends BasePage {


    public SingUpPage(WebDriver driver){
        super(driver);

    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement zipCode;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement continueBtm;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
    private WebElement firstName;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement lastName;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement emailField;


    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
    private WebElement psswdField;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
    private WebElement confirmPsswdField;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
    private WebElement register;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span" )
    private WebElement confirmMessage;

    public SingUpPage() {
        super();
    }


    public void continueBtmClick(){
        continueBtm.click();
    }
    public void registerClick(){
        register.click();
    }
    public void zipCodeField(String a) {
        zipCode.sendKeys(a);
    }
    public void firstNameField(String a) {
        firstName.sendKeys(a);
    }
    public void lastNameField(String a) {
        lastName.sendKeys(a);
    }
    public void emailField(String a) {
        emailField.sendKeys(a);
    }
    public void psswdField(String a) {
        psswdField.sendKeys(a);
    }
    public void confirmPsswdField(String a) {
        confirmPsswdField.sendKeys(a);
    }
    public String confirmMessage(){
        return confirmMessage.getText();

    }



}
