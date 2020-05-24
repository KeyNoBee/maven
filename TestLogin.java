
import org.junit.Test;

import pageobjects.BaseTest;
import pageobjects.LoginPage;
import pageobjects.MainPage;



    public class TestLogin extends BaseTest {
        private String email;
        private String password;


        LoginPage loginPage = new LoginPage(getDriver());
        MainPage mainPage = new MainPage(getDriver());

        public TestLogin(String email, String password) {
            this.email = email;
            this.password = password;
        }

        @Test
        public void TestLogin() throws Exception {
            driver.get("https://www.sharelane.com/cgi-bin/main.py");
            mainPage.emailField(email);
            mainPage.psswdField(password);

            mainPage.loginClick();

            driver.get("https://www.sharelane.com/cgi-bin/main.py");

            Thread.sleep(2000);
            System.out.println(loginPage.getName());


}





}
