package ru.stqa.pft.jivo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.jivo.model.ContactData;
import ru.stqa.pft.jivo.model.GroupData;

import java.util.List;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoHome();
    List<ContactData> before = app.getContactHelper().getContactsList();
    app.getNavigationHelper().gotoNewContactPage();
    app.getContactHelper().createContact(new ContactData("Yokoto", "Pralgauskas", null, "79995101062", "test2"), true);
    app.getNavigationHelper().gotoHome();
    List<ContactData> after = app.getContactHelper().getContactsList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }

}
