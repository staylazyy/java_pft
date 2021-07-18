package ru.stqa.pft.jivo.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.jivo.model.GroupData;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test2", "borjomi", "googagaga"));
    app.getNavigationHelper().gotoGroupPage();
  }

}
