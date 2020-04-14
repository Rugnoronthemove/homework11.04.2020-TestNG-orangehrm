package com.orangehrmlive.demo.opensource.testsuite;

import com.orangehrmlive.demo.opensource.loadproperty.LoadProperty;
import com.orangehrmlive.demo.opensource.pages.AccountPage;
import com.orangehrmlive.demo.opensource.pages.HomePage;
import com.orangehrmlive.demo.opensource.testbase.TestBase;
import org.testng.annotations.Test;

public class TestCase extends TestBase {

    //object creation
    LoadProperty loadProperty = new LoadProperty();
    HomePage homePage = new HomePage();
    AccountPage accountPage = new AccountPage();

    String username = loadProperty.getProperty("username");
    String password = loadProperty.getProperty("password");
    String welcomeAdminText = loadProperty.getProperty("welcomeAdminText");
    String loginPanelText = loadProperty.getProperty("loginPanelText");

    //TestCases
    @Test (groups = {"Regression","Sanity"})
    public void verifyUserCanSuccessfullyLogin() {
        //send text to username field
        homePage.clickAndSendTextToUsernameField(username);
        //send text to password field
        homePage.clickAndSendTextToPasswordField(password);
        //click on login button
        homePage.clickOnLoginBtn();
        //verify text on AccountPage
        accountPage.verifyTextWelcomeAdmin(welcomeAdminText);
    }

    @Test (groups = {"Regression","Smoke"})
    public void verifyUserCanSuccessfullyLogout() {
        //send text to username field
        homePage.clickAndSendTextToUsernameField(username);
        //send text to password field
        homePage.clickAndSendTextToPasswordField(password);
        //click on login button
        homePage.clickOnLoginBtn();
        //verify text on AccountPage
        accountPage.verifyTextWelcomeAdmin(welcomeAdminText);
        //click on welcome admin button
        accountPage.clickOnWelcomeAdmin();
        //click on logout link
        accountPage.clickOnLogoutLink();
        //verify text on HomePage
        homePage.verifyTextLoginPanelText(loginPanelText);
    }

}
