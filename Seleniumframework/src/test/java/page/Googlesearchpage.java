package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Googlesearchpage {
	private static WebElement element=null;
	
	public static WebElement product(WebDriver driver) {
		element=driver.findElement(By.xpath("//div[@class=\"container\"]//div//div[2]//div[@class=\"shop-menu pull-right\"]//ul//li[2]"));
		return element;
	}
	public static WebElement search_text(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id=\"search_product\"]"));
		return element;
	}
	public static WebElement search(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id=\"submit_search\"]"));
		return element;
	}
	
	public static WebElement item(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='product-overlay']//p[contains(text(),'Men Tshirt')]"));
		return element;
	}
	
}