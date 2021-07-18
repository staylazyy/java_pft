package ru.stqa.pft.jivo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.jivo.model.ContactData;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    app.getNavigationHelper().gotoHome();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoNewContactPage();
      app.getContactHelper().createContact(new ContactData("Yokoto", "Pralgauskas", null, "79995101062", "booga"), true);
      app.getNavigationHelper().gotoHome();
    }
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().selectContact(before - 1);
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().acceptDeletionAlert();
    app.getNavigationHelper().gotoHome();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);
  }

}
