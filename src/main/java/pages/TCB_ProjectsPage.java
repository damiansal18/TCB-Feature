package pages;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TCB_ProjectsPage extends baseTest {
    public TCB_ProjectsPage(){
        PageFactory.initElements(driver, this);
    }
    public String getTitle(){

        return driver.getTitle();
    }

    @FindBy(xpath = "/html/body/main/div[1]/div/div[3]/div[1]/div[11]/div/div[1]/a/img")
    WebElement OnePieceChaptersLink;

    public TCB_OnePieceChaptersPage clickChaptersLink() throws InterruptedException{
        OnePieceChaptersLink.click();
        Thread.sleep(5000);
        return new TCB_OnePieceChaptersPage();
    }
}
