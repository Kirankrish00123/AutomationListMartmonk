import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataExtract {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/Index1.html");
		
		
		// //*[@id="employee-details"]/tbody/tr[2]
		// //*[@id="employee-details"]/tbody/tr[3]
		// //*[@id="employee-details"]/tbody/tr[4]
		// //*[@id="employee-details"]/tbody/tr[2]/td[1]
		
		List<WebElement> rowElements = driver.findElements(By.xpath("//*[@id='employee-details']/tbody/tr"));
		System.out.println(rowElements.size());
		int rowSize = rowElements.size();
		
		for (int i=2;i<=rowSize;i++){
			List<WebElement> columnElements = driver.findElements(By.xpath("//*[@id='employee-details']/tbody/tr[1]/td"));
			System.out.println(columnElements.size());
			int ColSize = columnElements.size();
			
		}
		
		
		
			
			
		}

	}

