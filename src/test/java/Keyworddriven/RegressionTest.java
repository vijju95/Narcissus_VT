package Keyworddriven;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Unlimited.utils.Environment;
import keyworddrivenFW.UIKeywords;
public class RegressionTest {
	@SuppressWarnings("unused")
	@Test
	public void VarifyTitleOfHomePage() throws FileNotFoundException {
		
		Environment env = new Environment();
		
		UIKeywords.OpenBrowser("chrome");
		UIKeywords.launchUrl(env.getAppUrl());
		UIKeywords.driver.get("https://testingshastra.com/");
		
		String actualTitle = UIKeywords.driver.getTitle();
		
		WebElement element = null;
	}
}
