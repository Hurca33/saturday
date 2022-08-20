package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElement {

    public LoginPageElement(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="a[class='ico-login']")
    public WebElement logIn;

    @FindBy(id="Email")
    public WebElement inputEmail;

    @FindBy(id="Password")
    public WebElement inputPassword;

    @FindBy(css="input[value='Log in']")
    public WebElement inputLogIn;

    @FindBy(xpath="//span[text()='Login was unsuccessful. Please correct the errors and try again.']")
    public WebElement errorMessage;

}
