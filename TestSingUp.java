
import org.junit.Assert;
import org.junit.Test;
import pageobjects.BaseTest;
import pageobjects.SingUpPage;
import steps.Login;
import steps.SingUp;

public class TestSingUp extends BaseTest {
    SingUp singUp = new SingUp();
    Login login = new Login();
    SingUpPage sup = new SingUpPage();

    @Test
    public void singUp() throws Exception{
        singUp.navigateToSingUpForm();
        singUp.enterZipCode();
        singUp.enterMainData();
        Assert.assertEquals("Account is created!", sup.confirmMessage());

        TestLogin testLogin = new TestLogin(login.getEmail(), login.getPassword());
        testLogin.TestLogin();

    }




}
