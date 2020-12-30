import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/Index1.html");
		
		WebElement webElement = driver.findElement(By.xpath("//*[@id='employee-details']"));
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount  = rows.size();
		
		for (int i=1; i<=rowCount; i++){
			
			
			List<WebElement> column = driver.findElements(By.tagName("td"));
			int colmnCount  = column.size();
			
			
			for(int j=1; j<=colmnCount; j++){
				String tableValue = column.get(i).getText();
				if (tableValue.equals("kiran")){
					System.out.println("Text is"+column.get(j).getText());
				}
				
			}
		}
		

	}

}
