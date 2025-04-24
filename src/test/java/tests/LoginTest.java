// src/test/java/tests/LoginTest.java
package tests;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        LoginPage login = new LoginPage(driver);
        driver.get("https://bankapp.com/login");
        login.login(username, password);
        assert login.isLoginSuccessful();
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
                {"user1", "pass1"},
                {"user2", "pass2"},
        };
    }
}
