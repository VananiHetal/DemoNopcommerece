package Practice2;

import Practice2.Homepage;
import Practice2.Loginpage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.No;
import org.junit.Assert;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class MyStepDefs extends Homepage {

    Homepage homepage = new Homepage();
    Loginpage loginpage = new Loginpage();


    @Given("^user is on loginpage$")
    public void userIsOnLoginpage() {

        homepage.clickonLoginButton();
        loginpage.verifyUserIsOnLoginPage();
    }


    @When("^user enters invalid \"([^\"]*)\" or \"([^\"]*)\"$")
    public void userEntersInvalidOr(String Email, String password) {
        loginpage.loginDetails(Email, password);

    }

    @Then("^user should able to see \"([^\"]*)\"$")
    public void userShouldAbleToSee(String errormessage) {
        boolean b;

        if (loginpage.actualErrorMessage().contains(errormessage)||(loginpage.actualEmailErrorMessage().contains(errormessage)))
        {
            b = true;
        }
        else
        {
            b = false;
        }
        Assert.assertTrue(b);
    }
}
