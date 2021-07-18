package ru.stqa.pft.jivo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.jivo.model.ContactData;
import ru.stqa.pft.jivo.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoHome();
    List<ContactData> before = app.getContactHelper().getContactsList();
    app.getNavigationHelper().gotoNewContactPage();
    ContactData contact = new ContactData("Tvarina", "Pralgauskas", null, "79995101062", "test2");
    app.getContactHelper().createContact(contact, true);
    app.getNavigationHelper().gotoHome();
    List<ContactData> after = app.getContactHelper().getContactsList();
    Assert.assertEquals(after.size(), before.size() + 1);

    int max = 0;
    for (ContactData c:after) {
      if (c.getId() > max) {
        max = c.getId();
      }
    }
    contact.setId(max);
    before.add(contact);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
  }

}
