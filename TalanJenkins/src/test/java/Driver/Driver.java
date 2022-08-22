package Driver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Driver { 
	public static WebDriver driver;
	public static Properties prop;
	public static void intialization() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		System.setProperty("webdriver.edge.driver", projectPath+"/src/test/resources/Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.talan-academy.com");}

}


