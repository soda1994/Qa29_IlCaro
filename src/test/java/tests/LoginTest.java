package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{


    @Test
    public void loginSuccess(){
openLoginForm();
fillLoginForm("noa@gmail.com","Nnoa12345$");
submitForm();
        Assert.assertTrue(isLogged());
    }
    @AfterMethod
    public void postCondition(){

    }
}
