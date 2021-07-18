package ru.stqa.pft.jivo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.jivo.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoHome();
    int before = app.getContactHelper().getContactCount();
    app.getNavigationHelper().gotoNewContactPage();
    app.getContactHelper().createContact(new ContactData("Yokoto", "Pralgauskas", null, "79995101062", "test2"), true);
    app.getNavigationHelper().gotoHome();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before + 1);
  }

}
