package ru.stqa.pft.jivo.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.jivo.model.ContactData;
import ru.stqa.pft.jivo.model.GroupData;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    app.getNavigationHelper().gotoHome();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoNewContactPage();
      app.getContactHelper().createContact(new ContactData("Yokoto", "Pralgauskas", null, "79995101062", "booga"), true);
      app.getNavigationHelper().gotoHome();
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().acceptDeletionAlert();
    app.getNavigationHelper().gotoHome();
  }

}
