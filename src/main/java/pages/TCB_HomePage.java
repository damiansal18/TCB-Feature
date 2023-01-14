package pages;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TCB_HomePage extends baseTest{
    public TCB_HomePage(){

        PageFactory.initElements(driver, this);
    }
    public String getTitle()
    {
        return driver.getTitle();
    }

    @FindBy(xpath = " //*[@id=\"js-nav-menu\"]/nav/a[2] ")
    WebElement ProjectsTab;

    public TCB_ProjectsPage clickOnProjectsTab() throws InterruptedException{
        ProjectsTab.click();
        Thread.sleep(5000);
        return new TCB_ProjectsPage();
    }
    public String checkElementText(){
        return ProjectsTab.getText();
    }
}
