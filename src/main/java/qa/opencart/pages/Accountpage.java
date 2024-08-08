package qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accountpage {

	private WebDriver driver;

	public Accountpage(WebDriver driver) {
		this.driver = driver;

	}

	private By logoutlink = By.linkText("Logout");
	private By headers = By.cssSelector("div#content");
	private By Search = By.name("Search");

	private By searchicon = By.cssSelector("div#search button");

	public String getloginpagetitle() {
		String title = driver.getTitle();
		System.out.println("Acct page title" + title);

		return title;
	}

	public String getloginpageURL() {
		String URL = driver.getCurrentUrl();
		System.out.println("Acct page URL :" + URL);
		return URL;
	}

	public boolean islogoutlinkexist() {
		return driver.findElement(logoutlink).isDisplayed();
	}

	public List<String> getAccountpageheaders() {
		List<WebElement> heardlist = driver.findElements(headers);
		List<String> headervallist = new ArrayList<String>();
		for (WebElement e : heardlist) {
			String text = e.getText();
			headervallist.add(text);
		}
		return headervallist;

	}

	public boolean issearchexist() {
		return driver.findElement(headers).isDisplayed();
	}

	public Searchresultpage dosearch(String searchkey) {
		System.out.println("searching" + searchkey);

		if (issearchexist()) {
			driver.findElement(Search).sendKeys(searchkey);
			driver.findElement(searchicon).click();
			return new Searchresultpage(driver);

		} else {
			System.out.println("Search field is not present in the page");
		}
		return null;

	}

}
