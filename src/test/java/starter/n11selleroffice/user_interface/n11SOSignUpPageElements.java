package starter.n11selleroffice.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class n11SOSignUpPageElements {
    public static Target USERNAME_FIELD = Target.the("username textbox")
            .located(By.id("usernameInputText"));

    public static Target PASSWORD_FIELD = Target.the("password textbox")
            .located(By.id("passwordInputText"));

    public static Target PASSWORDRETYPE_FIELD = Target.the("passwordretype textbox")
            .located(By.id("passwordRetypeInputText"));

    public static Target EMAIL_FIELD = Target.the("email textbox")
            .located(By.id("emailInputText"));

    public static Target EMAILRETYPE_FIELD = Target.the("emailretype textbox")
            .located(By.id("emailRetypeInputText"));

    public static Target STORENAME_FIELD = Target.the("storename textbox")
            .located(By.id("nicknameInputText"));

    public static Target ERROR_MESSAGE = Target.the("error message")
            .locatedBy(".ui-message-error-detail");

    public static Target ACCEPTTERMS_CHECKBOX = Target.the("acceptterms checkbox")
            .located(By.id("acceptTermsAndConditions"));

    public static Target SIGNUP_BUTTON = Target.the("signup button")
            .located(By.id("j_id275_j_id_dk"));

    @FindBy(xpath = ".ui-message-error-detail")
    public WebElement errormessage;

    public void getErrorMessage(){
       String errormesage= errormessage.getText();
    }
//    public static Target MEMBERSHIPTYPE_RADİO = Target.the("membershiptype radio button")
//            .locatedBy(".ui-radiobutton-icon.ui-icon.ui-icon-bullet");
//
//    public static Target CATEGORYDROPDOWN_LABEL = Target.the("dropdown label")
//            .located(By.id("categoryGroupDropDown_label"));
}
