package ru.stqa.pft.jivo;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    gotoGroupPage();
  }

}
