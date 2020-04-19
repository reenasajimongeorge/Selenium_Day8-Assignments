package day8Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class absoluteXpath_Firefox {

	public static void main(String[] args) throws InterruptedException {
		// launch Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Selinium training\\RequiedTools\\Firefox Installer\\geckodriver.exe");
		WebDriver ffdriver=new FirefoxDriver();
		// Navigate to Facebook
		ffdriver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		System.out.println("facebook title: " + ffdriver.getTitle());
        ffdriver.manage().window().maximize(); // maximize window
        ffdriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Sample");  // Uniquely find firstname and enter data
        Thread.sleep(3000); // wait for 3 secs
        ffdriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("DirectLocator");  // Uniquely find lastname and enter data
        Thread.sleep(3000); // wait for 3 secs
		ffdriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("directlocator@test.com"); // find and enter email
		Thread.sleep(3000); // wait for 3 secs
		ffdriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("directlocator@test.com");  // confirm email
		Thread.sleep(3000); // wait for 3 secs
		ffdriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("password");  // enter password
		Thread.sleep(3000); // wait for 3 secs
		
		
		// select month from dropdown
	    Select month=new Select(ffdriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[1]")));
		month.selectByVisibleText("May");
		Thread.sleep(3000);// wait for 3 secs
		
		// select date from dropdown
		Select day=new Select(ffdriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[2]")));
		day.selectByValue("31");
		Thread.sleep(3000);
		
		// year from dropdown
		Select year=new Select (ffdriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[3]")));
		year.selectByVisibleText("2000");
		Thread.sleep(3000);
		
		ffdriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/span[1]/span[1]/input[1]")).click(); // select gender as female
		Thread.sleep(3000);
		ffdriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/button[1]")).click();  // click on sign up button
		Thread.sleep(5000);
		
		
		ffdriver.close();

	}

}
