package ru.stqa.pft.jivo;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    gotoHome();
    selectContact();
    deleteSelectedContacts();
    acceptDeletionAlert();
    gotoHome();
  }

}
