package ru.stqa.pft.jivo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ContactCreationTest extends TestBase{

  @Test
  public void testContactCreation() throws Exception {
    gotoNewContactPage();
    fillContactForm(new ContactData("Danil", "Pralgauskas", "staylazyy", "79995101062"));
    submitContactCreation();
    gotoHome();
  }

}
