package test;
import page.logoutPage;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class logoutTest extends createUserTest {
    @Test(priority = 3)

    public void logout() throws InterruptedException{
        ChromeDriver driver = getDriver();
        logoutPage logout = new logoutPage(driver);

        logout.clickusericon();
        logout.logout();



    }
}
