package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //list of elements and their locations
    By usernameField = By.cssSelector("input#txtUsername");
    By passwordField = By.cssSelector("input#txtPassword");
    By loginBtn = By.cssSelector("input.button");
    By loginPanelText = By.cssSelector("div#logInPanelHeading");

    //methods performing actions on elements
    public void clickAndSendTextToUsernameField(String str) {
        sendTextToElement(usernameField,str);
    }

    public void clickAndSendTextToPasswordField(String str) {
        sendTextToElement(passwordField,str);
    }

    public void clickOnLoginBtn() {
        clickOnElement(loginBtn);
    }

    public void verifyTextLoginPanelText(String str) {
        verifyTextAssertMethod(loginPanelText,str);
    }
}
