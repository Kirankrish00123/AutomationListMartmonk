
import java.io.FileInputStream;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import XL_UtilsData.Xls_Reader;



public class testcheck {

	public static void main(String[] args) throws InterruptedException {
		
		Xls_Reader reader = new Xls_Reader(".//Automation//src//Fanhood.xlsx");
		String sheet_name = "ids";
		
		String data_cell = reader.getCellData(sheet_name,0,2);
		System.out.print(data_cell);
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fanhood.martmonk.com/website/productManagement/products");
		driver.findElement(By.id("userName")).sendKeys("marmeto");
		driver.findElement(By.id("password")).sendKeys("mmto1#1*");
		driver.findElement(By.id("signInButton")).click();
		Thread.sleep(2000);
		//driver.get(arg0);
		
	

	}}