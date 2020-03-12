package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class seleniumExercise1 {

	public static void main(String[] args) {
		//Open Chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        //Navigate to AUT
        driver.get("http://services.smartbear.com/samples/TestComplete14/smartstore/");
        
        //Click on login link
        driver.findElement(By.xpath("//a[@class='menubar-link']//span[contains(text(),'Log in')]")).click();
        
        //Click on Register
        driver.findElement(By.xpath("//a[@class='btn btn-warning btn-lg btn-block register-button']")).click();
        
        //Enter details on registration form.
        //Gender: Male
        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        //First Name: John
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John");
        //Last Name: Hauge
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Hauge");
        //DoB: 13 Aug 1989
        WebElement dateOfBirth = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        dateOfBirth.sendKeys("15"); 
        WebElement dateOfBirth1 = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        dateOfBirth1.sendKeys("August"); 
        WebElement dateOfBirth2 = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        dateOfBirth2.sendKeys("1989"); 
        //Email Id
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jayasriak23@gmail.com");
        //userName: give any userName, remember it for login purpose-abc123.
        driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("abc12345");
     	//Password & confirm password: enter password and confirm password same value, any of your choice- ***@123.
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abc@12345");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("abc@12345");

        //Company Name: Any company name-abcLLC
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("abcLLC");
        
        //Select on Newsletter checkbox.
        driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
        
        //Click on Register
        driver.findElement(By.xpath("//button[@name='register-button']")).click();
        
        //Verify success message, as shown in below snap.
        WebElement successMsg = driver.findElement(By.xpath("//p[@class='section-body']"));
        String text = successMsg.getText();
        Assert.assertEquals(text,"Your registration completed");
        
        //Click on Continue Button.
        driver.findElement(By.xpath("//a[@class='btn btn-secondary register-continue-button']")).click();
        
        //Close Browser.
        driver.close();

        
	}

}
