package PageObjectModel;

import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebElement assignmentsLink;
	public WebElement coursesLink;
	public WebElement videosLink;
	public WebElement notesLink;
	
	public void clickOnAssignments() {
		assignmentsLink.click();
	}
}
//HomePage home = new HomePage();
//home.clickOnAssignments();				old method keyword drivenn method