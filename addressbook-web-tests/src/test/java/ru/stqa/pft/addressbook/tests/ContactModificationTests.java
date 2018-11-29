package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoMainPage();
        app.getContactHelper().setContact();
        app.getContactHelper().fillContactForm(new ContactData("abc", "def", "abcdef", "lord", "ooo", "ab@ya.com"));
        app.getContactHelper().submitModificationContact();
        app.getNavigationHelper().gotoMainPage();
    }
}
