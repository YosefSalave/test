import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenProject 
{
	@Test
	public void test()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.get("https://www.facebook.com");
		driver.navigate().back();
		driver.get("https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html");
		
		System.out.println("Hello");
	}

}
