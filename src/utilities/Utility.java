package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest                                              //MenTest extends Utility extends BaseTest
{
    public void clickOnElement(By by)                                             //Method to click on Element
    {
       driver.findElement(by).click();
    }
    public void sendTextToElement( By by, String text)                           //Method to send text to Element
    {
        driver.findElement(by).sendKeys(text);
    }
    public String getTextFromElement(By by)                                      //Method to get text from Element
    {
       return driver.findElement(by).getText();
    }

    //************************* Alert Methods *****************************************************

    public void switchToAlert()
    {
        driver.switchTo().alert();                                              //Method will switch to alert
    }
    public void acceptAlert()
    {
        driver.switchTo().alert().accept();                                    //Method to accept alert
    }
    public void dismissAlert()
    {
        driver.switchTo().alert().dismiss();                                  //Method to dismiss alert
    }
    public String  getTextFromAlert()                                         //Method to get text from alert
    {
        return driver.switchTo().alert().getText();
    }

    //*************************** Select Class Methods ***************************************//

public void selectByValueFromDropDown(By by,String value)                    //Method to select value from Dropdown
{
    WebElement dropDown = driver.findElement(by);
    Select s1 = new Select(dropDown);
    s1.selectByValue(value);
}
public void selectByVisibleTextFromDropDown(By by,String text)               //Method to select by visible text from Drop down
{
    WebElement dropDown = driver.findElement(by);
    Select s1 = new Select(dropDown);
    s1.selectByVisibleText(text);
}
public void selectByIndexFromDropDown(By by, int index)                      //Method to select index from drop down
{
    WebElement dropDown = driver.findElement(by);
    Select s1 = new Select(dropDown);
    s1.selectByIndex(index);
}

//*************************** Action Methods ***************************************//
    public void mouseHoverToElement(By by)                                   //Method to mouse hover on element
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }
}
