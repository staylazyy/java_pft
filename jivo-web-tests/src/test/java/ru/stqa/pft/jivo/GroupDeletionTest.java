package ru.stqa.pft.jivo;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    gotoGroupPage();
  }

}
