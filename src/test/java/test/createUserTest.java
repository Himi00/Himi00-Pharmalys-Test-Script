package test;
import org.testng.annotations.Test;
import page.createUserPage;
import org.openqa.selenium.chrome.ChromeDriver;
import testData.values;

import static testData.values.uname;


public class createUserTest extends loginTest{

    @Test(priority = 2)

    public void userCreate() throws InterruptedException{
        ChromeDriver driver = getDriver();
        createUserPage createuser = new createUserPage(driver);

        createuser.clickonUser();
        createuser.clickonnew();
        createuser.inputname(values.uname);
        createuser.inputemail(values.uemail);
        createuser.inputpassword(values.upassword);
        createuser.userRole();
        createuser.clickonSave();
        Thread.sleep(3000);
        createuser.searchuser(values.usearch);
        Thread.sleep(3000);

    }
}
