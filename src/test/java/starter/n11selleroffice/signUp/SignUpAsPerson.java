package starter.n11selleroffice.signUp;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import starter.n11.navigation.login.LoginAsUser;
import starter.n11.navigation.user_interface.n11LoginPageElements;
import starter.n11selleroffice.user_interface.n11SOHomePageElements;
import starter.n11selleroffice.user_interface.n11SOSignUpPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SignUpAsPerson implements Task {

    private final String usernameStr;
    private final String passwordStr;
    private final String trypasswordStr;
    private final String email;
    private final String tryemail;
    private final String storename;

    @Step("{0} Sign Up n11 seller office")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(n11SOHomePageElements.SIGNUP_BTN),

                WaitUntil.the(n11SOSignUpPageElements.USERNAME_FIELD,isClickable()).forNoMoreThan(5).seconds(),
                SendKeys.of(this.usernameStr).into(n11SOSignUpPageElements.USERNAME_FIELD),

                WaitUntil.the(n11SOSignUpPageElements.PASSWORD_FIELD,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(n11SOSignUpPageElements.PASSWORD_FIELD),
                SendKeys.of(this.passwordStr).into(n11SOSignUpPageElements.PASSWORD_FIELD),

                WaitUntil.the(n11SOSignUpPageElements.PASSWORDRETYPE_FIELD,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(n11SOSignUpPageElements.PASSWORDRETYPE_FIELD),
                SendKeys.of(this.trypasswordStr).into(n11SOSignUpPageElements.PASSWORDRETYPE_FIELD),

                WaitUntil.the(n11SOSignUpPageElements.EMAIL_FIELD,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(n11SOSignUpPageElements.EMAIL_FIELD),
                SendKeys.of(this.email).into(n11SOSignUpPageElements.EMAIL_FIELD),

                WaitUntil.the(n11SOSignUpPageElements.EMAILRETYPE_FIELD,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(n11SOSignUpPageElements.EMAILRETYPE_FIELD),
                SendKeys.of(this.tryemail).into(n11SOSignUpPageElements.EMAILRETYPE_FIELD),

                WaitUntil.the(n11SOSignUpPageElements.STORENAME_FIELD,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(n11SOSignUpPageElements.STORENAME_FIELD),
                SendKeys.of(this.storename).into(n11SOSignUpPageElements.STORENAME_FIELD),

                WaitUntil.the(n11SOSignUpPageElements.ACCEPTTERMS_CHECKBOX,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(n11SOSignUpPageElements.ACCEPTTERMS_CHECKBOX),

                WaitUntil.the(n11SOSignUpPageElements.SIGNUP_BUTTON,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(n11SOSignUpPageElements.SIGNUP_BUTTON)

        );
    }

    public SignUpAsPerson(String usernameStr, String passwordStr,String trypasswordStr,String email,String tryemail,String storename){
        this.usernameStr = usernameStr;
        this.passwordStr = passwordStr;
        this.trypasswordStr = trypasswordStr;
        this.email = email;
        this.tryemail = tryemail;
        this.storename = storename;

    }

    public static SignUpAsPerson signUpThePage(String usernameStr, String passwordStr,String trypasswordStr,String email,String tryemail,String storename) {
        return instrumented(SignUpAsPerson.class
                ,usernameStr,passwordStr,trypasswordStr,email,tryemail,storename);
    }


}
