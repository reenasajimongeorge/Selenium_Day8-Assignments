package day8Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class directLocator_Firefox {

	public static void main(String[] args) throws InterruptedException {
		// launch Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Selinium training\\RequiedTools\\Firefox Installer\\geckodriver.exe");
		WebDriver ffdriver=new FirefoxDriver();
		// Navigate to Facebook
		ffdriver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		System.out.println("facebook title: " + ffdriver.getTitle());
        ffdriver.manage().window().maximize(); // maximize window
        ffdriver.findElement(By.name("firstname")).sendKeys("Sample");  // Uniquely find firstname and enter data
        Thread.sleep(3000); // wait for 3 secs
        ffdriver.findElement(By.name("lastname")).sendKeys("DirectLocator");  // Uniquely find lastname and enter data
        Thread.sleep(3000); // wait for 3 secs
		ffdriver.findElement(By.name("reg_email__")).sendKeys("directlocator@test.com"); // find and enter email
		Thread.sleep(3000); // wait for 3 secs
		ffdriver.findElement(By.name("reg_email_confirmation__")).sendKeys("directlocator@test.com");  // confirm email
		Thread.sleep(3000); // wait for 3 secs
		ffdriver.findElement(By.name("reg_passwd__")).sendKeys("password");  // enter password
		Thread.sleep(3000); // wait for 3 secs
		
		
		// select month from dropdown
	    Select month=new Select(ffdriver.findElement(By.id("month")));
		month.selectByVisibleText("May");
		Thread.sleep(3000);// wait for 3 secs
		
		// select date from dropdown
		Select day=new Select(ffdriver.findElement(By.name("birthday_day")));
		day.selectByValue("31");
		Thread.sleep(3000);
		
		// year from dropdown
		Select year=new Select (ffdriver.findElement(By.id("year")));
		year.selectByVisibleText("2000");
		Thread.sleep(3000);
		
		ffdriver.findElement(By.id("u_0_6")).click(); // select gender as female
		Thread.sleep(3000);
		ffdriver.findElement(By.name("websubmit")).click();
		
		
		
		ffdriver.close();

	}

}
