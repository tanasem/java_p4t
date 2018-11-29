package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoMainPage();
        app.getContactHelper().setContact();
        app.getContactHelper().fillContactForm(new ContactData("abc", "xyz", "test", "test2_mod", "ab@ya.ru", null), false);
        app.getContactHelper().submitModificationContact();
        app.getNavigationHelper().gotoMainPage();
    }
}
