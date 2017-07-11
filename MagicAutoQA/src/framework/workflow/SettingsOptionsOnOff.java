package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SettingsOptionsOnOff {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://terragomagic.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSettingsOptionsOnOff() throws Exception {
    driver.get(baseUrl + "/login");
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("jfields");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("1990");
    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/form/button")).click();
    driver.findElement(By.cssSelector("span[value=\"labels\"]")).click();
    driver.findElement(By.cssSelector("span[value=\"system\"]")).click();
    driver.findElement(By.cssSelector("div.switch.")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[4]/div/div/div/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[4]/div/div/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[4]/div/div/div[3]/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[4]/div/div/div[4]/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[4]/div/div/div[5]/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div[4]/div/div/div[6]/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[4]/div/div/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[4]/div/div/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div[2]/div")).click();
    driver.findElement(By.cssSelector("div.checkboxEmpty > img")).click();
    driver.findElement(By.cssSelector("div.checkboxEmpty > img")).click();
    driver.findElement(By.cssSelector("div.checkboxEmpty > img")).click();
    driver.findElement(By.cssSelector("div.checkboxEmpty > img")).click();
    driver.findElement(By.cssSelector("div.checkboxEmpty > img")).click();
    driver.findElement(By.cssSelector("div.checkboxEmpty")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div[3]/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div/div[2]/div")).click();
    driver.findElement(By.cssSelector("div.switch.")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
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
}