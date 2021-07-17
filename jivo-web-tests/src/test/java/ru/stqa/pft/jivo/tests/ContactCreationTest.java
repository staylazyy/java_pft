package ru.stqa.pft.jivo.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.jivo.model.ContactData;

import static org.testng.Assert.fail;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoNewContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Yokoto", "Pralgauskas", null, "79995101062", "test2"), true);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().gotoHome();
  }

}
