package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.formsite.com/templates/registration-form-templates/"
    		+ "diversity-award-application/");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//div[@id='imageTemplateContainer']")).click();
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
    driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("hi");
	}

}
 