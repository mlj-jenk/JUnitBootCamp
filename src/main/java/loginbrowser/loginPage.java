package loginbrowser;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
	WebDriver driver;
	
@Before	
public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jenkinmj\\SeleniumApril2020\\ProjBCjunit\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("http://techfios.com/test/101/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}


	//Test 1: Validate when the toggle all check box is CHECKED, all check boxes
	//for list items are also CHECKED ON.

@Test	
public void ValidateToggele() {	
	
	WebElement a = document.getElementsByName("allbox");
	for(int i=0; i<a.length; i++)
	   if(a[i].checked)
		System.out.println("Check Box is Checked");
	   else 
		System.out.println("Check Box is UnChecked");
}
}
	//driver.findElement(By.name("allbox")).click();
	//driver.findElement(input(attribute="on")).click();
   	
	
	//Test 2: Validate that a single list item could be removed using the remove
    //button when a single checkbox is selected.

 @Test2
 public void enterNewCategory() throws Throwable {
 driver.findElement(By.xpath("//*[@id=\"extra\"]/input[1]")).sendKeys("test2222") WebElement TEST2222_ITEM_LOCATOR;
} 
public void clickTestName(String testName) { 
TEST2222_ITEM_LOCATOR.click();
 }

//Validate TestCase
driver.findElement(By.xpath("//*[@id=\"extra\"]/input[1]"))

//Example not exact to validate			
boolean removedcat = driver.findElement(By.xpath("h2[text()='Dashboard ']")).isDisplayed;
Assert.assertTrue(removedcat);

	

  //Test 3: Validate that all list item could be removed using the remove
  //button and when "Toggle All" functionality is on.
 @Test3
 public void ToggleAll() {
 if(driver.FindElement(By.xpath(*//html/body/div[3]/input[3]")).getAttribute("class").contains("Toggle All"));
 
 FindBy(how = How.NAME, using = "//input[html/body/div[3]/input[1]='Remove']") WebElement CLICK_REMOVE_BUTTON_LOCATOR;

  public void clickButton() { 
  CLICK_REMOVE_BUTTON_LOCATOR.click();


