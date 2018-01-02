import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pepeJeans {
	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","/home/sravan/eclipse-workspace/OttoWebsite/lib/geckodriver");
	     WebDriver driver = new FirefoxDriver();
	     driver.get("https://www.google.de");
	     driver.findElement(By.id("lst-ib")).sendKeys("Pepe Jeans");
	     driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	     WebDriverWait wait = new WebDriverWait(driver, 20); 
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Pepe Jeans Online-Shop | OTTO")));
	     driver.findElement(By.partialLinkText("Pepe Jeans Online-Shop | OTTO")).click();
	     driver.findElement(By.linkText("Pepe Jeans Chiffonkleid »MARY«, im modischen Leo-Muster")).click();
	     driver.findElement(By.xpath("//ul//li[@data-variationid='594838149']")).click();
	     driver.findElement(By.id("addToBasket")).click();
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("p_layer")));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("or_itemAdded__itemInfo")));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#p_layer [data-qa='itemInfo'] a[data-qa='goToBasket']")));
	     driver.findElement(By.cssSelector("#p_layer [data-qa='itemInfo'] a[data-qa='goToBasket']")).click();
	     driver.findElement(By.cssSelector(".or_basketPage__topCheckoutButton a[class='p_btn100--1st']")).click();  
	     driver.findElement(By.xpath("//a[@data-qa = 'user_login_link_register']")).click();
	     driver.findElement(By.xpath("//input[@id = 'us_id_registrationSalutation_mr']")).click();
	     driver.findElement(By.xpath("//input[@id = 'us_id_registrationFirstName']")).click();
	     driver.findElement(By.xpath("//input[@id = 'us_id_registrationFirstName']")).sendKeys("Sravan");
	     driver.findElement(By.xpath("//input[@id = 'us_id_registrationLastName']")).click();
	     driver.findElement(By.xpath("//input[@id = 'us_id_registrationLastName']")).sendKeys("Katta");
	     driver.findElement(By.xpath("//input[@id = 'us_id_registrationEmail']")).click();
	     driver.findElement(By.xpath("//input[@id = 'us_id_registrationEmail']")).sendKeys("sravanece222@gmail.com");
	     driver.findElement(By.xpath("//input[@id = 'us_id_registrationEmail_repeat']")).click();
	     driver.findElement(By.xpath("//input[@id = 'us_id_registrationEmail_repeat']")).sendKeys("sravanece222@gmail.com");
	     driver.findElement(By.xpath("//input[@id = 'us_id_password']")).click();
	     driver.findElement(By.xpath("//input[@id = 'us_id_password']")).sendKeys("Sravan0)");
	     driver.findElement(By.xpath("//input[@id = 'us_id_passwordRepeat']")).click();
	     driver.findElement(By.xpath("//input[@id = 'us_id_passwordRepeat']")).sendKeys("Sravan0)");
	     driver.findElement(By.xpath("//input[@id = 'user_newsletter_allowance_checkbox_id']")).click();
	     
	}
}
