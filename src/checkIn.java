import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkIn {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\user\\Desktop\\automation\\Fanhood.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fanhood.martmonk.com/website/productManagement/products");
		driver.findElement(By.id("userName")).sendKeys("marmeto");
		driver.findElement(By.id("password")).sendKeys("mmto1#1*");
		driver.findElement(By.id("signInButton")).click();
		Thread.sleep(3000);
		for (int i=795; i<=rowcount; i++){
			
			DataFormatter formatter = new DataFormatter();
		    String val = formatter.formatCellValue(sheet.getRow(i).getCell(0));
		    
			driver.get("https://fanhood.martmonk.com/website/ProductManagement/productEdit/"+val);
			
			WebElement element = driver.findElement(By.id("title"));
			String TitlePro = element.getAttribute("value");
			System.out.println("Product Title is"+"-"+TitlePro);
			
			driver.findElement(By.id("reorder-image")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alrt = driver.switchTo().alert();
		    alrt.accept();
	
		   
		    
			driver.findElement(By.id("submit1")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("productSubmit")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt1 = driver.switchTo().alert();
		    String alert_check = alrt.getText();
		    System.out.println("The Status of Product is -"+alert_check);
		    System.out.println("--------------------------------------------------------------------------------------------");
		    alrt1.accept();
		    Thread.sleep(2000);	
			
		}
	}

}


				
	
		
		
		
			
	   
		    			
			
			
			
			
			
