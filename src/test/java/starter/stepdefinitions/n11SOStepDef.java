package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11.navigation.login.LoginAsUser;
import starter.n11selleroffice.signUp.SignUpAsPerson;
import starter.n11selleroffice.tasks.NavigateTo;
import starter.n11selleroffice.user_interface.n11SOSignUpPageElements;

public class n11SOStepDef {
    Actor actor = Actor.named("patikabootcampers");
    n11SOSignUpPageElements n11SOSignUpPageElements=new n11SOSignUpPageElements();
    @Managed
    WebDriver webDriver;

    @Given("user launch browser and open the signup page")
    public void user_launch_browser_and_open_the_signup_page() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theN11SOHomePage());
    }

    @When("user signed in sellerOffice with valid credentials")
    public void user_signed_in_seller_office_with_valid_credentials() throws InterruptedException {
        actor.attemptsTo(SignUpAsPerson.signUpThePage
                ("randomuser","randompass12",
                        "randompass12", "randomemail@random.com",
                        "randomemail@random.com","randomstorename"));
        Thread.sleep(5000);
    }

    @Then("user signed in sellerOffice successfully")
    public void user_signed_in_seller_office_successfully() {

        System.out.println(n11SOSignUpPageElements.errormessage.getText());
    }
}
