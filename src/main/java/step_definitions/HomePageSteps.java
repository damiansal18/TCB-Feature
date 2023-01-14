package step_definitions;

import base.baseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.TCB_HomePage;
import pages.TCB_ProjectsPage;
import utils.Constants;


public class HomePageSteps extends baseTest {
    @Before

    public void openBrowser(){
        baseTest.setupBrowser();
    }

    @After
    public void closeBrowser(){
        driver.close();
    }

    TCB_HomePage tcb_homePage;
    TCB_ProjectsPage tcb_projectsPage;

    @Given("^I am on the TCB Home Page$")
    public void onHomePage(){
        String URL = prop.getProperty("baseURL");
        driver.get(URL);

        tcb_homePage = new TCB_HomePage();
        String expectedTitle = Constants.TCB_HOMEPAGE;

        Assert.assertEquals(expectedTitle, tcb_homePage.getTitle());
    }

    @When("^I click on the Projects tab$")
    public void onProjectsTab() throws InterruptedException{
        System.out.println(tcb_homePage.checkElementText());

        tcb_projectsPage = tcb_homePage.clickOnProjectsTab();
    }

    @Then("^I should end up on the Projects page$")
    public void onProjectsPage() {
        String projURL = driver.getCurrentUrl();
        Assert.assertTrue(projURL.equalsIgnoreCase(Constants.TCB_PROJECTS_URL));
    }
}
