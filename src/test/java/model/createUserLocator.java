package model;

import org.openqa.selenium.By;

public class createUserLocator {
    public static By user = By.xpath("//a[@href='/admin/users']//div[@class='flex flex-1']");
    public static By newuser = By.cssSelector("a[class='filament-button filament-button-size-md inline-flex items-center justify-center py-1 gap-1 font-medium rounded-lg border transition-colors outline-none focus:ring-offset-2 focus:ring-2 focus:ring-inset min-h-[2.25rem] px-4 text-sm text-white shadow focus:ring-white border-transparent bg-primary-600 hover:bg-primary-500 focus:bg-primary-700 focus:ring-offset-primary-700 filament-page-button-action']");
    //fill form
    public static By username = By.xpath("//input[@id='data.name']");
    public static By useremail =By.xpath("//input[@id='data.email']");
    public static By userpassword = By.xpath("//input[@id='data.password']");
    public static By userrole = By.xpath("//select[@id='data.role_id']");
    public static By save = By.xpath("//span[@x-show='! isUploadingFile']");
    public static By search = By.xpath("//input[@placeholder='Search']");

}
