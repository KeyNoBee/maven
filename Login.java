package steps;

import org.openqa.selenium.WebDriver;
import pageobjects.BasePage;
import pageobjects.BaseTest;
import pageobjects.LoginPage;



import static pageobjects.BaseTest.getDriver;

public class Login extends BasePage {
    LoginPage loginPage= new LoginPage(getDriver());

    public Login() {
        super(BaseTest.driver);

    }



        public String getEmail() {
            return loginPage.getEmailText();
        }

        public String getPassword() {
            return loginPage.getPasswordText();
    }
}
