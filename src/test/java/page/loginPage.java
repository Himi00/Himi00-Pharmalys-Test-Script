package page;
import base.base;
import model.commonMethod;
import model.loginLocator;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginPage extends base{

    ChromeDriver driver;
    commonMethod common;
    public loginPage(ChromeDriver driver){
        this.driver = driver;
        common = new commonMethod(driver);
    }

    public void emailinput(String email){

        common.setText(loginLocator.email,email);

    }
    public void passwordinput(String password){

        common.setText(loginLocator.password, password);

    }
    public void submit(){

        common.clickOnButton(loginLocator.submit);

    }



}
