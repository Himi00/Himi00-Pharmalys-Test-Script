package page;
import model.commonMethod;
import model.logoutLocator;
import org.openqa.selenium.chrome.ChromeDriver;
public class logoutPage {
    ChromeDriver driver;
    commonMethod common;
    public logoutPage(ChromeDriver driver){
        this.driver = driver;
        common = new commonMethod(driver);
    }

    public void clickusericon(){

        common.clickOnButton(logoutLocator.clickUserIcon);

    }
    public void logout(){

        common.clickOnButton(logoutLocator.clickLogout);

    }


}
