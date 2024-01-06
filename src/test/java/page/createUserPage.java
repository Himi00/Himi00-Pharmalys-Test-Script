package page;
import base.base;
import model.commonMethod;
import model.createUserLocator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class createUserPage extends base {

    ChromeDriver driver;
    commonMethod common;
    public createUserPage(ChromeDriver driver){
        this.driver = driver;
        common = new commonMethod(driver);
    }
    public void clickonUser() throws InterruptedException {

        common.clickOnButton(createUserLocator.user);
    }

    public void clickonnew() throws InterruptedException {
        common.clickOnButton(createUserLocator.newuser);
    }
    public void inputname( String uname) throws InterruptedException {
        common.setText(createUserLocator.username, uname);
    }
    public void inputemail(String uname) throws InterruptedException {
        common.setText(createUserLocator.useremail, uname);
    }
    public void inputpassword( String upassword) throws InterruptedException {
        common.setText(createUserLocator.userpassword, upassword);
    }

    public void userRole() throws InterruptedException {
        int listSelectIndex = 6;
        for (int i = 0; i < listSelectIndex; i++) {
            common.keyboardAction(createUserLocator.userrole, Keys.ARROW_DOWN, Keys.ENTER);
        }
        //common.keyboardAction(createUserLocator.userrole, Keys.ARROW_DOWN, Keys.ENTER);
    }
    public void clickonSave() throws InterruptedException {
        common.clickOnButton(createUserLocator.save);
    }
    public void searchuser( String usearch) throws InterruptedException {
        Thread.sleep(3000);
        common.setText(createUserLocator.search,usearch);
    }




}
