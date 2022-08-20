package TEST;

import POM.LoginPageElement;
import POM.MyAccountPageElement;
import UTIL.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPageTest extends BaseDriver {

    LoginPageElement loginPageElement;
    MyAccountPageElement MyAccountPageElement;

    @Test(priority = 1,dataProvider = "LogInData")
    public void loginPositiveTest(String userName, String password){
        loginPageElement= new LoginPageElement(driver);
        MyAccountPageElement = new MyAccountPageElement(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPageElement.logIn.click();
        loginPageElement.inputEmail.sendKeys(userName);
        loginPageElement.inputPassword.sendKeys(password);
        loginPageElement.inputLogIn.click();

        String actualMessage= MyAccountPageElement.welcomeMessage.getText();
        String expectedMessage="Welcome to our store";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test(priority = 2,dataProvider = "LogInData2")
    public void loginNegativeTest2(String userName, String password){
        loginPageElement= new LoginPageElement(driver);
        MyAccountPageElement = new MyAccountPageElement(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPageElement.logIn.click();
        loginPageElement.inputEmail.sendKeys(userName);
        loginPageElement.inputPassword.sendKeys(password);
        loginPageElement.inputLogIn.click();

        String actualError= loginPageElement.errorMessage.getText();
        String expectedError="Login was unsuccessful. Please correct the errors and try again.";
        Assert.assertEquals(actualError,expectedError);
    }

    @Test(priority = 3,dataProvider = "LogInData3")
    public void loginNegativeTest3(String userName, String password){
        loginPageElement= new LoginPageElement(driver);
        MyAccountPageElement = new MyAccountPageElement(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPageElement.logIn.click();
        loginPageElement.inputEmail.sendKeys(userName);
        loginPageElement.inputPassword.sendKeys(password);
        loginPageElement.inputLogIn.click();

        String actualError= loginPageElement.errorMessage.getText();
        String expectedError="Login was unsuccessful. Please correct the errors and try again.";
        Assert.assertEquals(actualError,expectedError);
    }

    @Test(priority = 4,dataProvider = "LogInData4")
    public void loginNegativeTest4(String userName, String password){
        loginPageElement= new LoginPageElement(driver);
        MyAccountPageElement = new MyAccountPageElement(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPageElement.logIn.click();
        loginPageElement.inputEmail.sendKeys(userName);
        loginPageElement.inputPassword.sendKeys(password);
        loginPageElement.inputLogIn.click();

        String actualError= loginPageElement.errorMessage.getText();
        String expectedError="Login was unsuccessful. Please correct the errors and try again.";
        Assert.assertEquals(actualError,expectedError);
    }

    @DataProvider(name = "LogInData") // Enter your correct email and correct password
    public Object [][] testDataProvider() {
        return new Object[][] { {"uguhfruguhfr@gmail.com","uguhfr1"} };
    }
    @DataProvider(name = "LogInData2") // Enter your incorrect email and correct password
    public Object [][] testDataProvider2() {
        return new Object[][] { {"xasxjkndcj@gmail.com","uguhfr1"} };
    }
    @DataProvider(name = "LogInData3") // Enter your correct email and incorrect password
    public Object [][] testDataProvider3() {
        return new Object[][] { {"uguhfruguhfr@gmail.com","cbdahjcidns"} };
    }
    @DataProvider(name = "LogInData4") // Enter your incorrect email and incorrect password
    public Object [][] testDataProvider4() {
        return new Object[][]{{"cctympmc@gmail.com", "vjigdvnj"}};
    }






















































































}



