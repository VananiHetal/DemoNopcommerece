package Practice2;

//import com.sun.org.apache.xpath.internal.operations.String;

import org.junit.Assert;
import org.openqa.selenium.By;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

public class Loginpage extends Utils {

    LoadProp loadProp = new LoadProp();

    By enterEmail = By.id("Email");
    By enterPassword = By.xpath("//input[@id='Password']");
    By clickonLoginbuttorn = By.xpath("//input[@class='button-1 login-button']");
    By getErrorMessage = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]");
    By getEmailErrorMessage=By.xpath("//span[@id='Email-error']");
    public void verifyUserIsOnLoginPage() {
        assertURL("login");
    }

    public void loginDetails(String Email, String password) {

        enterElements(enterEmail, Email);
        enterElements(enterPassword, password);
        clickElementBy(clickonLoginbuttorn);
    }

    public String actualErrorMessage() {
        String s=getTextFromElement(getErrorMessage);
        System.out.println(s);
        return s;
    }
    public String actualEmailErrorMessage(){
        String s = getTextFromElement(getEmailErrorMessage);
        return s;
    }



}
