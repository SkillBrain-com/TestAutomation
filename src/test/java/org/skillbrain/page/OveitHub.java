package org.skillbrain.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class OveitHub extends BasePage {
 private WebDriver driver;

 @FindBy (css = ".ripple-button.blue-outlined")
  private  WebElement oveitHubButton;
 @FindBy (xpath = "//h3[normalize-space()='Mazda']")
  private  WebElement eventName;
 @FindBy (xpath = "//button[@data-slot='button']")
 private WebElement bookNowButton;
 @FindBy (css = "input[name='email']")
 private WebElement emailFieldAttraction;
 @FindBy (xpath =  "//input[@name='field-9824']")
 private WebElement attractionNameField;
 @FindBy (xpath = "//button[@type='submit']")
 private WebElement submitButton;



 public OveitHub(WebDriver driver) {
  super(driver);
  this.driver = driver;
  PageFactory.initElements(this.driver, this);
 }

 public  void clickOveitHubButton(){
waitForVisibility(oveitHubButton, Duration.ofSeconds(5));
  oveitHubButton.click();
  switchToSecondWindow();
 }

 public void clickEventTitle(){
  waitForVisibility(eventName, Duration.ofSeconds(5));
  eventName.click();
 }

 public void iClickOnBookNowButton(){
  waitForText("Mazda", Duration.ofSeconds(5));
  bookNowButton.click();
 }

 public void iCompleteEmailAndNameEvent(){
 waitForVisibility(emailFieldAttraction,Duration.ofSeconds(5));
emailFieldAttraction.sendKeys("otniel.moiseanu@gmail.com");
attractionNameField.sendKeys("Mazda");
 }

 public void clickOnSubmitButton(){
submitButton.click();

//  waitForText("Welcome Aboard", Duration.ofSeconds(7));
 }



}