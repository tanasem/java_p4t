package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("abc", "def", "abcdef", "lord", "ooo", "ab@ya.com"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToMainPage();

    }

}
