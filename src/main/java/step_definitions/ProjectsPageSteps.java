package step_definitions;

import base.baseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.TCB_HomePage;
import pages.TCB_OnePieceChaptersPage;
import pages.TCB_ProjectsPage;
import utils.Constants;

public class ProjectsPageSteps extends baseTest {

    TCB_ProjectsPage tcb_projectsPage = new TCB_ProjectsPage();
    TCB_OnePieceChaptersPage tcb_onePieceChaptersPage;
    TCB_HomePage tcb_homePage;

    @Given("^I navigate to the One Piece Chapters Page$")
    public void toOnePieceChapterPage() throws InterruptedException{
        String URL = prop.getProperty("baseURL");
        driver.get(URL);

        tcb_homePage = new TCB_HomePage();
        tcb_projectsPage = tcb_homePage.clickOnProjectsTab();
        tcb_onePieceChaptersPage = tcb_projectsPage.clickChaptersLink();

        String expectedURL= driver.getCurrentUrl();
        Assert.assertTrue(expectedURL.equalsIgnoreCase(Constants.ONEPIECE_CHAPTERS_URL));

    }
    @When("I click on the One Piece image")
    public void iClickOnTheOnePieceImage() {
    }

    @Then("I should get to the Chapters Page")
    public void iShouldGetToTheChaptersPage() {

    }


}
