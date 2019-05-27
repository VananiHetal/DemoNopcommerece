package Practice2;

import org.openqa.selenium.By;

public class Homepage extends Utils {

    LoadProp loadProp = new LoadProp();

    By clickonLogin = By.linkText("Log in");



  public void clickonLoginButton(){

        clickElementBy(clickonLogin);
  }


}


