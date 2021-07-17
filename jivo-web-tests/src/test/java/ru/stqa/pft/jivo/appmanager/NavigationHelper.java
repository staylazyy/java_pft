package ru.stqa.pft.jivo.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {
  private WebDriver driver;

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }

  public void gotoHome() {
    click(By.linkText("home"));
  }

  public void gotoNewContactPage() {
    click(By.linkText("add new"));
  }
}
