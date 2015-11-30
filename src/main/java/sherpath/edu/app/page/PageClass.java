package sherpath.edu.app.page;

import org.openqa.selenium.WebDriver;

public class PageClass {
	
	public void launchUrl(WebDriver driver, String url) {
		driver.get(url);
	}

}
