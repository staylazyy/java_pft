package ru.stqa.pft.jivo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.jivo.model.GroupData;

import java.util.List;

public class GroupModificationTest extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", "hehe", "mega"));
      app.getNavigationHelper().gotoGroupPage();
    }
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size() - 1);
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("booga", "ooga", "choomba"));
    app.getGroupHelper().submitGroupModification();
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());
  }
}
