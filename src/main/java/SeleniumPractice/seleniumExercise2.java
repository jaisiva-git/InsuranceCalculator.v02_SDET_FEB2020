package SeleniumPractice;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumExercise2 {
	
	@Test
	public void registrationOfAut() throws AWTException {
		//Open Chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        //Navigate to AUT
        driver.get(" http://demo.automationtalks.com/index.html"); 
        
        //Enter any vehicle data in all mandatory fields. Click on next button.
       // driver.findElement(By.xpath("//select[@id='make']")).click();
       // String valueToBeSelected = "Mercedes Benz";
        //driver.findElement(By.xpath("//select[@id='make']//option[text()='"+ valueToBeSelected +"']")).click();
        
        // fill vehicle data
        WebElement make  = driver.findElement(By.name("Make"));
	    selectFromDropDown(make,"Mercedes Benz");
	    
	    WebElement model  = driver.findElement(By.name("Model"));
	    selectFromDropDown(model,"Motorcycle"); 
	    
	    driver.findElement(By.xpath("//input[@id='cylindercapacity']")).sendKeys("100");
        driver.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1000");
	    driver.findElement(By.name("Date of Manufacture")).sendKeys("01/31/2020");

	    WebElement numberOfseat  = driver.findElement(By.name("Number of Seats"));
	    selectFromDropDown(numberOfseat,"3");
	    
	    String rightHandDrive="Yes";
		driver.findElement(By.xpath("//label[text()='"+rightHandDrive+"']")).click();
	    
	    WebElement numberOfseat2  = driver.findElement(By.name("Number of Seats Motorcycle"));
	    selectFromDropDown(numberOfseat2,"3");
	  
	    
	    WebElement fuel=driver.findElement(By.id("fuel"));
		Select fl=new Select(fuel);
		fl.selectByValue("Diesel");
		
		driver.findElement(By.id("payload")).sendKeys("100");
		driver.findElement(By.id("totalweight")).sendKeys("150");

	    
	    driver.findElement(By.xpath("//input[@id='listprice']")).sendKeys("40000");
	    driver.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("LCI789");
	    driver.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("50000");
	    driver.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
	    
	    String pageTitle = driver.getTitle();
	    System.out.println("Page title: "+pageTitle);
	    
	    // fill insurance data

	    driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Abc");
	    driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("cde");
	    driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("01/31/1985");
	    
	    String gender="Male";
		driver.findElement(By.xpath("//label[text()='"+gender+"']")).click();
	    driver.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("245 San francisco ln");
	    
	    WebElement country= driver.findElement(By.id("country"));
	    Select selectCountry = new Select (country);
	    selectCountry.selectByValue("United States"); 
	    
	    driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("94404");
	    driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Foster City");
	    
	    WebElement occupation=driver.findElement(By.id("occupation"));
		Select op=new Select(occupation);
		op.selectByValue("Employee");
			
	    driver.findElement(By.xpath("//input[@id='speeding']/parent::label ")).click(); 
		
		driver.findElement(By.xpath("//input[@id='website']")).sendKeys("http://demo.automationtalks.com/index.html");
		
		driver.findElement(By.xpath("//button[@id='open']")).click();
		
		//copy to clipboard
		String file = "/Users/sasha/Pictures/iPhone5S-Jan2018/IMG_2113.JPG";
		StringSelection selection = new StringSelection(file);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);
		Robot robot;
        robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

		driver.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
		
		//fill product data
		
		driver.findElement(By.xpath("//input[@id='startdate']")).sendKeys("06/17/2020");
		
		WebElement insuranceSum= driver.findElement(By.id("insurancesum"));
	    Select is = new Select (insuranceSum);
	    is.selectByValue("5000000");
	   
	    WebElement meritRating = driver.findElement(By.id("meritrating"));
	    Select mr=new Select(meritRating);
		mr.selectByValue("Bonus 1");
		
		WebElement damageInsurance = driver.findElement(By.id("damageinsurance"));
		Select di=new Select(damageInsurance);
		di.selectByValue("Partial Coverage");
		driver.findElement(By.xpath("//input[@id=\"EuroProtection\"]/following-sibling::span")).click();
		
		WebElement courtesyCar = driver.findElement(By.id("courtesycar"));
		Select cc = new Select(courtesyCar);
		cc.selectByValue("Yes");
		driver.findElement(By.id("nextselectpriceoption")).click();
		
		//choose price option
		driver.findElement(By.xpath("//input[@id='selectgold']/following-sibling::span")).click();
		driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("www.abcdef.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("758464864");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sasha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("JJJJJ");
		driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("JJJjj");
		driver.findElement(By.xpath("//input[@id='Comments']")).sendKeys("send quote");
		
		driver.findElement(By.xpath("//button[@id='sendemail']")).click();
		 
	}

		public  void  selectFromDropDown(WebElement ele, String val) {
			Select ns =new Select(ele);
			ns.selectByValue(val);
	}

	
}