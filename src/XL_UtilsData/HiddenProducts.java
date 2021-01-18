package XL_UtilsData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenProducts {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		File src = new File("C:\\Users\\user\\Desktop\\automation\\Fanhood.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);

		
				
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://fanhood.martmonk.com/website/productManagement/products");
		driver.findElement(By.id("userName")).sendKeys("marmeto");
		driver.findElement(By.id("password")).sendKeys("mmto1#1*");
		driver.findElement(By.id("signInButton")).click();
		Thread.sleep(200);
		
        for (int i=1; i<=rowcount; i++){
        	
        	
			
			DataFormatter formatter = new DataFormatter();
		    String val = formatter.formatCellValue(sheet.getRow(i).getCell(0));
		    System.out.println(val);
		    
			driver.get("https://fanhood.martmonk.com/website/ProductManagement/productEdit/"+val);
			
			WebElement element = driver.findElement(By.id("title"));
			String TitlePro = element.getAttribute("value");
			System.out.println("Product Title is"+"-"+TitlePro);
			
			WebElement Logistic;
			Logistic= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/ul/li[3]/a")));
			Logistic.click();
			
			WebElement DeleteButton;
			DeleteButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='productDelete']")));
			DeleteButton.click();
			
			
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alrt = driver.switchTo().alert();
		    alrt.accept();
		    
		    wait.until(ExpectedConditions.alertIsPresent());
			Alert alrttwo = driver.switchTo().alert();
		    alrt.accept();
		    
		    
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
}
