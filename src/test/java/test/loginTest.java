package test;
import base.base;
import org.testng.annotations.Test;
import page.loginPage;
import testData.values;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest extends base {
    @Test(priority = 1)

    public void gologin() throws InterruptedException{
        ChromeDriver driver = getDriver();
        loginPage login = new loginPage(driver);

        login.emailinput(values.email);
        login.passwordinput(values.password);
        login.submit();
        Thread.sleep(3000);



    }
}
