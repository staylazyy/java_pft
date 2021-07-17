package ru.stqa.pft.jivo.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.jivo.model.ContactData;

public class ContactModificationTest extends TestBase{

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHome();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Danzo", "Birobijan", "choomba", "79996601062"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHome();
  }
}
