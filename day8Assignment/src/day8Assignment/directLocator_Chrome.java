package day8Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class directLocator_Chrome {

	public static void main(String[] args) throws InterruptedException {
		// launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Selinium training\\RequiedTools\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeBrowser=new ChromeDriver();
		// Navigate to Facebook
		chromeBrowser.get("https://www.facebook.com/");
		Thread.sleep(5000);
	
		System.out.println("facebook title: " + chromeBrowser.getTitle());
        chromeBrowser.manage().window().maximize(); // maximize window
        chromeBrowser.findElement(By.name("firstname")).sendKeys("Sample");  // Uniquely find firstname and enter data
        Thread.sleep(3000); // wait for 3 secs
        chromeBrowser.findElement(By.name("lastname")).sendKeys("DirectLocator");  // Uniquely find lastname and enter data
        Thread.sleep(3000); // wait for 3 secs
		chromeBrowser.findElement(By.name("reg_email__")).sendKeys("directlocator@test.com"); // find and enter email
		Thread.sleep(3000); // wait for 3 secs
		chromeBrowser.findElement(By.name("reg_email_confirmation__")).sendKeys("directlocator@test.com");  // confirm email
		Thread.sleep(3000); // wait for 3 secs
		chromeBrowser.findElement(By.name("reg_passwd__")).sendKeys("password");  // enter password
		Thread.sleep(3000); // wait for 3 secs
		
		
		// select month from dropdown
	    Select month=new Select(chromeBrowser.findElement(By.id("month")));
		month.selectByVisibleText("May");
		Thread.sleep(3000);// wait for 3 secs
		
		// select date from dropdown
		Select day=new Select(chromeBrowser.findElement(By.name("birthday_day")));
		day.selectByValue("31");
		Thread.sleep(3000);
		
		// year from dropdown
		Select year=new Select (chromeBrowser.findElement(By.id("year")));
		year.selectByVisibleText("2000");
		Thread.sleep(3000);
		
		chromeBrowser.findElement(By.id("u_0_6")).click(); // select gender as female
		Thread.sleep(3000);
		chromeBrowser.findElement(By.name("websubmit")).click();
		
		
		
		chromeBrowser.close();

	}

}
