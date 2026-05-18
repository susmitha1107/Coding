package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bygoolesearchpage {

    WebDriver driver;

    public Bygoolesearchpage(WebDriver driver) {
        this.driver = driver;
    }

    By product = By.xpath("//div[@class='container']//div//div[2]//div[@class='shop-menu pull-right']//ul//li[2]");
    By search_text = By.xpath("//input[@id='search_product']");
    By search = By.xpath("//button[@id='submit_search']");
    By item = By.xpath("//div[@class='product-overlay']//p[contains(text(),'Men Tshirt')]");

    public void product() {
        driver.findElement(product).click();
    }

    public void search_text(String txt) {
        driver.findElement(search_text).sendKeys(txt);
    }

    public void search() {
        driver.findElement(search).click();
    }

    public void item() {
        driver.findElement(item);
    }
}
