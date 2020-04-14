package com.orangehrmlive.demo.opensource.pages;

import com.orangehrmlive.demo.opensource.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    //list of elements and their locations
    By welcomeAdmin = By.cssSelector("a.panelTrigger");
    By logoutLink = By.xpath("//a[contains(text(),'Logout')]");

    //methods performing actions on elements
    public void verifyTextWelcomeAdmin(String str) {
        verifyTextAssertMethod(welcomeAdmin,str);
    }

    public void clickOnWelcomeAdmin() {
        clickOnElement(welcomeAdmin);
    }

    public void clickOnLogoutLink() {
        clickOnElement(logoutLink);
    }
}
