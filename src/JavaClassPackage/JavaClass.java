package JavaClassPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaClass {
	


	WebDriver driver = new ChromeDriver();

	@BeforeTest

	public void myBeforeTest() {

		driver.manage().window().maximize();

	}

//	@Test()
//	public void myfirstTest() throws InterruptedException   {
//		// id , class , name , linkText , partialLinkText , tagname 
//
//		driver.get("https://magento.softwaretestingboard.com/");
//
//driver.findElement(By.partialLinkText("Create")).click();
//
//Thread.sleep(3000); 
//
//WebElement theforrrrrmmmmm = driver.findElement(By.id("form-validate")); 
//List<WebElement> myinputFields = theforrrrrmmmmm.findElements(By.tagName("input"));
//
//System.out.println("this is the number of input"+myinputFields.size());
//
//for(int i = 0 ; i < myinputFields.size() ;i++ ) {
//	
//	if(myinputFields.get(i).getAttribute("type").equals("hidden")) {
//		break ; 
//	}else {
//		myinputFields.get(i).sendKeys("ahmad"); 
//
//	}
//}

//
//	}
	
	
	@Test
	public void mysecondTest() throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/");
		
	WebElement myListOfITEMS =	driver.findElement(By.xpath("//ol[@class='product-items widget-product-grid']"));
	
	List<WebElement> allItems = myListOfITEMS.findElements(By.tagName("li"));
	
	Random rand = new Random(); 
	
	int randomindex = rand.nextInt(allItems.size()); 
	
	
	allItems.get(randomindex).click(); 

	for(int i = 0 ; i < allItems.size();i++) {
	
	}
		
	driver.navigate().back();
		
	
}}