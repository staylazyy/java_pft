package ru.stqa.pft.jivo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.jivo.model.ContactData;

public class ContactModificationTest extends TestBase{

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHome();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoNewContactPage();
      app.getContactHelper().createContact(new ContactData("Yokoto", "Pralgauskas", null, "79995101062", "booga"), true);
      app.getNavigationHelper().gotoHome();
    }
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().initContactModification(before-1);
    app.getContactHelper().fillContactForm(new ContactData("Danzo", "Birobijan", "choomba", "79996601062", null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHome();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before);
  }
}
