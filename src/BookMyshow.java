import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookMyshow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fanhood.martmonk.com/website/productManagement/products");
		driver.findElement(By.id("userName")).sendKeys("marmeto");
		driver.findElement(By.id("password")).sendKeys("mmto1#1*");
		driver.findElement(By.id("signInButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		WebElement webElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div[3]/div[4]/div/div/table/tbody"));
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount  = rows.size();
		System.out.println(rowCount);
		
		
		
		
		System.out.print("Moved to page 6");
		driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[4]")).click();
		Thread.sleep(4000);
		
		
		
		for(int i =26 ;i<=rowCount;i++){
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div[3]/div[4]/div/div/table/tbody/tr["+ i +"]")).click();
			
			String parent = driver.getWindowHandle();	

			Set<String> allWindows = driver.getWindowHandles();

			for (String child : allWindows) {
				if (!parent.equalsIgnoreCase(child)) {

					driver.switchTo().window(child);

				}
			}
			WebElement element = driver.findElement(By.id("title"));
			String TitlePro = element.getAttribute("value");
			System.out.println(TitlePro);
			driver.findElement(By.id("reorder-image")).click();
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt = driver.switchTo().alert();
		    alrt.accept();
			driver.findElement(By.id("submit1")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("productSubmit")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt1 = driver.switchTo().alert();
		    alrt1.accept();
		    Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[5]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[4]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[4]")).click();
			Thread.sleep(4000);
			
			System.out.print("Moved to page 6 completed");
			
		}
		
		System.out.print("Moved to page 7");
		driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[7]")).click();
		Thread.sleep(5000);
		
		for(int i =1 ;i<=rowCount;i++){
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div[3]/div[4]/div/div/table/tbody/tr["+ i +"]")).click();
			
			String parent = driver.getWindowHandle();	

			System.out.println(parent);

			Set<String> allWindows = driver.getWindowHandles();

			for (String child : allWindows) {
				if (!parent.equalsIgnoreCase(child)) {

					driver.switchTo().window(child);

				}
			}
			WebElement element = driver.findElement(By.id("title"));
			String TitlePro = element.getAttribute("value");
			System.out.println(TitlePro);
			driver.findElement(By.id("reorder-image")).click();
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt = driver.switchTo().alert();
		    alrt.accept();
			driver.findElement(By.id("submit1")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("productSubmit")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt1 = driver.switchTo().alert();
		    alrt1.accept();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[7]")).click();
			Thread.sleep(5000);
			System.out.print("Moved to page 7 completed");
			
		}
		
		System.out.print("Moved to page 8");
		driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[8]]")).click();
		Thread.sleep(5000);
		
		for(int i =1 ;i<=rowCount;i++){
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div[3]/div[4]/div/div/table/tbody/tr["+ i +"]")).click();
			
			String parent = driver.getWindowHandle();	

			System.out.println(parent);

			Set<String> allWindows = driver.getWindowHandles();

			for (String child : allWindows) {
				if (!parent.equalsIgnoreCase(child)) {

					driver.switchTo().window(child);

				}
			}
			WebElement element = driver.findElement(By.id("title"));
			String TitlePro = element.getAttribute("value");
			System.out.println(TitlePro);
			driver.findElement(By.id("reorder-image")).click();
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt = driver.switchTo().alert();
		    alrt.accept();
			driver.findElement(By.id("submit1")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("productSubmit")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt1 = driver.switchTo().alert();
		    alrt1.accept();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[8]")).click();
			Thread.sleep(5000);
			System.out.print("Moved to page 8 completed");
			
		}
		
		System.out.print("Moved to page 9");
		driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[9]")).click();
		Thread.sleep(5000);
		
		for(int i =1 ;i<=rowCount;i++){
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div[3]/div[4]/div/div/table/tbody/tr["+ i +"]")).click();
			
			String parent = driver.getWindowHandle();	

			System.out.println(parent);

			Set<String> allWindows = driver.getWindowHandles();

			for (String child : allWindows) {
				if (!parent.equalsIgnoreCase(child)) {

					driver.switchTo().window(child);

				}
			}
			WebElement element = driver.findElement(By.id("title"));
			String TitlePro = element.getAttribute("value");
			System.out.println(TitlePro);
			driver.findElement(By.id("reorder-image")).click();
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt = driver.switchTo().alert();
		    alrt.accept();
			driver.findElement(By.id("submit1")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("productSubmit")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt1 = driver.switchTo().alert();
		    alrt1.accept();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[9]")).click();
			Thread.sleep(5000);
			System.out.print("Moved to page 9 completed");
			
		}
		
		System.out.print("Moved to page 10");
		driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[10]")).click();
		Thread.sleep(5000);
		
		for(int i =1 ;i<=rowCount;i++){
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div[3]/div[4]/div/div/table/tbody/tr["+ i +"]")).click();
			
			String parent = driver.getWindowHandle();	

			System.out.println(parent);

			Set<String> allWindows = driver.getWindowHandles();

			for (String child : allWindows) {
				if (!parent.equalsIgnoreCase(child)) {

					driver.switchTo().window(child);

				}
			}
			WebElement element = driver.findElement(By.id("title"));
			String TitlePro = element.getAttribute("value");
			System.out.println(TitlePro);
			driver.findElement(By.id("reorder-image")).click();
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt = driver.switchTo().alert();
		    alrt.accept();
			driver.findElement(By.id("submit1")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("productSubmit")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt1 = driver.switchTo().alert();
		    alrt1.accept();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[10]")).click();
			Thread.sleep(5000);
			System.out.print("Moved to page 10 completed");
			
		}
		
		System.out.print("TEN PAGES are Done");
		System.out.print("Moved to page 11");
		driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[11]")).click();
		Thread.sleep(5000);
		
		for(int i =1 ;i<=rowCount;i++){
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div[3]/div[4]/div/div/table/tbody/tr["+ i +"]")).click();
			
			String parent = driver.getWindowHandle();	

			System.out.println(parent);

			Set<String> allWindows = driver.getWindowHandles();

			for (String child : allWindows) {
				if (!parent.equalsIgnoreCase(child)) {

					driver.switchTo().window(child);

				}
			}
			WebElement element = driver.findElement(By.id("title"));
			String TitlePro = element.getAttribute("value");
			System.out.println(TitlePro);
			driver.findElement(By.id("reorder-image")).click();
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt = driver.switchTo().alert();
		    alrt.accept();
			driver.findElement(By.id("submit1")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("productSubmit")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt1 = driver.switchTo().alert();
		    alrt1.accept();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[11]")).click();
			Thread.sleep(5000);
			System.out.print("Moved to page 11 completed");
			
		}
		
		System.out.print("Moved to page 12");
		driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[12]")).click();
		Thread.sleep(5000);
		
		for(int i =1 ;i<=rowCount;i++){
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div[3]/div[4]/div/div/table/tbody/tr["+ i +"]")).click();
			
			String parent = driver.getWindowHandle();	

			System.out.println(parent);

			Set<String> allWindows = driver.getWindowHandles();

			for (String child : allWindows) {
				if (!parent.equalsIgnoreCase(child)) {

					driver.switchTo().window(child);

				}
			}
			WebElement element = driver.findElement(By.id("title"));
			String TitlePro = element.getAttribute("value");
			System.out.println(TitlePro);
			driver.findElement(By.id("reorder-image")).click();
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt = driver.switchTo().alert();
		    alrt.accept();
			driver.findElement(By.id("submit1")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("productSubmit")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt1 = driver.switchTo().alert();
		    alrt1.accept();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[12]")).click();
			Thread.sleep(5000);
			System.out.print("Moved to page 12 completed");
			
		}
		
		System.out.print("Moved to page 13");
		driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[13]")).click();
		Thread.sleep(5000);
		
		for(int i =1 ;i<=rowCount;i++){
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div[3]/div[4]/div/div/table/tbody/tr["+ i +"]")).click();
			
			String parent = driver.getWindowHandle();	

			System.out.println(parent);

			Set<String> allWindows = driver.getWindowHandles();

			for (String child : allWindows) {
				if (!parent.equalsIgnoreCase(child)) {

					driver.switchTo().window(child);

				}
			}
			WebElement element = driver.findElement(By.id("title"));
			String TitlePro = element.getAttribute("value");
			System.out.println(TitlePro);
			driver.findElement(By.id("reorder-image")).click();
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt = driver.switchTo().alert();
		    alrt.accept();
			driver.findElement(By.id("submit1")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("productSubmit")).click();
			WebDriverWait wait1 = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alrt1 = driver.switchTo().alert();
		    alrt1.accept();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='productsList_paginate']/span/a[13]")).click();
			Thread.sleep(5000);
			System.out.print("Moved to page 13 completed");
			
		}
		

}
}
