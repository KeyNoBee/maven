package steps;

import pageobjects.BaseTest;
import pageobjects.MainPage;
import pageobjects.SingUpPage;

public class SingUp  extends BaseTest {
    MainPage mainPage = new MainPage(getDriver());
    SingUpPage singUpPage= new SingUpPage(getDriver());

    public void  navigateToSingUpForm(){
        mainPage.singUpClick();
    }
    public void enterZipCode(){
        singUpPage.zipCodeField( "111111");
        singUpPage.continueBtmClick();
    }
    public void enterMainData(){
        singUpPage.firstNameField("dddddd");
        singUpPage.lastNameField("dddddd");
        singUpPage.emailField("ddddd@gmail.com");
        singUpPage.psswdField("ccccccc");
        singUpPage.confirmPsswdField("cccccc");
        singUpPage.registerClick();
    }


}
