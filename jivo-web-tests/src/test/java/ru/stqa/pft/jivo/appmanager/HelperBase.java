package ru.stqa.pft.jivo.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase {
  WebDriver driver;

  public HelperBase(WebDriver driver) {
    this.driver = driver;
  }

  protected void click(By locator) {
    driver.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    if (text != null) {
      String existingText = driver.findElement(locator).getAttribute("value");
      if (! text.equals(existingText)) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
      }
    }
  }

  protected boolean isElementPresent(By locator) {
    try {
      driver.findElement(By.name("new_group"));
      return true;
    } catch (NoSuchElementException ex) {
        return false;
    }
  }
}
