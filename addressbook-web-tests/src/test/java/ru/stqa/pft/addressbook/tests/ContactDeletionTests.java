package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getContactHelper().goToMainPage();
        app.getContactHelper().setContact();
        app.getContactHelper().deleteSelectedContact();
    }

}
