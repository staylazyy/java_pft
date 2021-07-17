package ru.stqa.pft.jivo.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.jivo.model.ContactData;

import static org.testng.Assert.assertTrue;

public class ContactHelper extends HelperBase {
  private boolean acceptNextAlert = true;

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"),contactData.getSecondname());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("mobile"),contactData.getPhoneMobile());

    if (creation) {
      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void deleteSelectedContacts() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void acceptDeletionAlert() {
    assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

  public void initContactModification() {
    click(By.xpath("//*[@id=\"maintable\"]/tbody/tr[2]/td[8]/a"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }
}
