package pages;

import base.baseTest;
import org.openqa.selenium.support.PageFactory;

public class TCB_OnePieceChaptersPage extends baseTest {

    public TCB_OnePieceChaptersPage(){

        PageFactory.initElements(driver, this);
    }
    public String getTitle(){

        return driver.getTitle();
    }
}
