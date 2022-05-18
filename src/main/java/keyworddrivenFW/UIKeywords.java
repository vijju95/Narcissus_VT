package keyworddrivenFW;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	
	public static RemoteWebDriver driver = null;						//why used static method here??????????
	
	public static void OpenBrowser(String browsername) {				//we are asking for name which browser you want to open
		
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if (browsername.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else {
			System.out.println("invalid browser name"+browsername);
		}
	}
		public static void launchUrl(String string) {
		
		}
}