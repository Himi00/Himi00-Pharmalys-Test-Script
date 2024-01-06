package model;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class commonMethod {
    ChromeDriver driver;

    public commonMethod(ChromeDriver driver){
        this.driver = driver;
    }

    public void setText(By fieldText, String inputText){

        driver.findElement(fieldText).sendKeys(inputText);
    }

    public void keyboardAction(By fieldText, Keys keys, Keys keys1){
        driver.findElement(fieldText).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
    }

    public void clickOnButton(By btnLocator){
        driver.findElement(btnLocator).click();
    }

    public void clickOnField(By btnLocator){
        driver.findElement(btnLocator).click();
    }

    public String getLocatorText(By elementsLocator){
        String text = driver.findElement(elementsLocator).getText();
        return text;
    }
}
