import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static <WebElements> void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v0jgzzzgfrrbw7qxpuzzyg-on.drv.tw/TestTable/TaskTabel/Index1.html");		
		
		// //*[@id="employee-details"]/tbody/tr
		// //*[@id="employee-details"]/tbody/tr[1]/td
		List<WebElement> rowElements = driver.findElements(By.xpath("//*[@id='employee-details']/tbody/tr"));
		System.out.println(rowElements.size());
		int rowSize = rowElements.size();
		
		List<WebElement> columnElements = driver.findElements(By.xpath("//*[@id='employee-details']/tbody/tr[1]/td"));
		System.out.println(columnElements.size());
		int ColSize = columnElements.size();
		
		 List<String> value = new ArrayList<String>();
		 
		 for(int i=1; i<=rowSize;i++){
			 
		 for (int j=1; j<columnElements.size();j++){
	           // System.out.println(columnElements.get(j).getText());
	           // value.add(driver.findElement(By.xpath("//*[@id='employee-details']/tbody/tr["+i+"]/td["+j+"]")).getText());
	           // System.out.println(value);
				WebElement TableData =  driver.findElement(By.xpath("//*[@id='employee-details']/tbody/tr["+i+"]/td["+j+"]"));
				String data = TableData.getText();
				System.out.println(data);
				
	        }
		 break;
	}
		
		

		
	}

	}
			
			
				
				
			
	

		




