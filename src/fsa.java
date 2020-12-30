import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fsa {

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
		
		
		
		System.out.print("Moved to page 2");
		driver.findElement(By.xpath("//*[@id='productsList_next']")).click();
		Thread.sleep(5000);
		
		for(int i =4 ;i<=50;i++){
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div[3]/div[4]/div/div/table/tbody/tr["+ i +"]")).click();
			
			String parent = driver.getWindowHandle();	

			System.out.println(parent);

			Set<String> allWindows = driver.getWindowHandles();

			for (String child : allWindows) {
				if (!parent.equalsIgnoreCase(child)) {

					driver.switchTo().window(child);

				}
			}
			
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
			System.out.print("Moved to page 2 completed");
			
		}
	}}



























Moved to page 3 completedCDwindow-8435C656E0B64DECA67A22ED7C7A6A6A
Moved to page 3 completedCDwindow-08C7F7FFD0A29787E4038C4DE13B2AC1
Moved to page 3 completedCDwindow-EFC110148AF1D16E846A1FB68B41F3C9
Moved to page 3 completedCDwindow-3166A973914AA0896BC6C68DE450EEAB
Moved to page 3 completedCDwindow-8C89D4E1F11AD9694CBD2D825673E3EA
Moved to page 3 completedCDwindow-41E4BD47FFC653518C941859590233D2
Moved to page 3 completedCDwindow-0E9C54BC4908AE0A0E5198F7A63F70A6
Moved to page 3 completedCDwindow-A31FEBE2FC352AACC8632C4A0C9ED8A1
Moved to page 3 completedCDwindow-1FC08D379CD8139A86483FF69475618D
Moved to page 3 completedCDwindow-45A5B25A53F46963C3D27578B8EEDE40
Moved to page 3 completedCDwindow-215B41D18350162C63CBFD8A5EB94DCB
Moved to page 3 completedCDwindow-AE6D1ADFB158D4B1A35801EAD946E0D0
Moved to page 3 completedCDwindow-EE2A00AAE653830D4A6F4F09F15CC685
Moved to page 3 completedCDwindow-E6A843CD87762087E9F07144C75F3D85
Moved to page 3 completedCDwindow-EE152CEE8C5B0E776681ACEE91D7ED1B
Moved to page 3 completedCDwindow-F790E9A6EE54DFDEF04A7D3423A87F32
Moved to page 3 completedCDwindow-A43249210A969E61346E58BE80E1BCEB
Moved to page 3 completedCDwindow-007A25B745BF1F6C8CD74E82A042A5C5
Moved to page 3 completedCDwindow-F71D2286C209482F51BB709DB9D6DF9C
Moved to page 3 completedCDwindow-B6DD5ED7C760814830E4DD373088BCB3
Moved to page 3 completedCDwindow-BF0C11B56551B663565C9A1BA4CFCD39
Moved to page 3 completedCDwindow-A1B79EC8A553B8A37D3D9912CFD353C8
Moved to page 3 completedCDwindow-0EB8632E515D9459107DD2F2529A933E
Moved to page 3 completedCDwindow-F546642410AE412805728DB16EDBB39B
Moved to page 3 completedCDwindow-C49566F5DA682A17448E0BF5FE98DF04
Moved to page 3CDwindow-D60946D1037E17DA05D9C6AA5B1BDB0A
Moved to page 3 completedCDwindow-4C8AE159E6AA064E910E9B44DA310B9F
Moved to page 3 completedCDwindow-C1119BC5101DAC62FC2A05EB4CA3ED1E
Moved to page 3 completedCDwindow-5765A38C77433A4DC1EA217DA597D4F3
Moved to page 3 completedCDwindow-C4140D08ADF524BDF8605866532387D5
Moved to page 3 completedCDwindow-2BF45ED1C1090110B726B798ED96ECD4
Moved to page 3 completedCDwindow-17FD24DBF1F4B31A8EA3652EAAA9E7D5
Moved to page 3 completedCDwindow-650E2BE4D8FFF829428E9EB7D1B397E8
Moved to page 3 completedCDwindow-C9B84B0FD1FC467BC7AB68D26A7E0742
Moved to page 3 completedCDwindow-3FDFDB7341C136584EF6F127D9043F6D
Moved to page 3 completedCDwindow-D9A9338260BDDB3B70BA4D7C03EF3D4E
Moved to page 3 completedCDwindow-D0F75FAAFB8A5404BE30A30638EBF33C
Moved to page 3 completedCDwindow-7BD881B9B7B89AE02809176571681CED
Moved to page 3 completedCDwindow-5435AE33B8E0D68DC8670ABD61D0004C
Moved to page 3 completedCDwindow-8443B5026A708D225024CC7447D65979
Moved to page 3 completedCDwindow-0492B4AD26BC57AD5AB5C8844BF4AD3D
Moved to page 3 completedCDwindow-B60DF4F30F5628135AE880562F12F539
Moved to page 3 completedCDwindow-FDDD2FD169FD19447523821ADE5207C8
Moved to page 3 completedCDwindow-A7685E48A18E6C69F154BD349D84B93B
Moved to page 3 completedCDwindow-032BFC821F4CB1A24030E781699C4880
Moved to page 3 completedCDwindow-1989FAB494C88CE4C0E8DAC9670100B9
Moved to page 3 completedCDwindow-49D518C914A4C2C14C064C5CB984B309
Moved to page 3 completedCDwindow-11B2FACFC1B158444657EFB0663F7BA7
Moved to page 3 completedCDwindow-B85489D3172F0A3CDD34478C0ADB0A52
Moved to page 3 completedCDwindow-6643292B8C9AF4A2103FF73AA2E2D13A
Moved to page 3 completedCDwindow-43C5252F30FD20539EAF225B47FC8532
Moved to page 3








Moved to page 4CDwindow-84E040A2F175E530449BC01A77308E9D
Moved to page 4 completedCDwindow-CB40E4C70B57ADCBD9031079106DBA2D
Moved to page 4 completedCDwindow-49398599A49351EB7EB29217D08750D6
Moved to page 4 completedCDwindow-99473482EEB03FFDED02E5E91BA48609
Moved to page 4 completedCDwindow-F40AADA1135E5582DE483DFF515B3427
Moved to page 4 completedCDwindow-B1783C6B86536651913C5A6DD759B029
Moved to page 4 completedCDwindow-E26939C64671CA0DDE12203248B9B4DB
Moved to page 4 completedCDwindow-E5AF568EFA58E1DEC9B74AB3601879A8
Moved to page 4 completedCDwindow-B115A726C5AD319BF44977D8AB853F84
Moved to page 4 completedCDwindow-FAA38C99951E858E4696FB4E2FC1070F
Moved to page 4 completedCDwindow-4221992096E4B6466ACEED8EDBA51AFB
Moved to page 4 completedCDwindow-D9969797B005D11254C1C78772C13903
Moved to page 4 completedCDwindow-D1D6E28EECB429434905FE457E6FEEF1
Moved to page 4 completedCDwindow-0B992E5742B70E36B2B797EAFAB21E54
Moved to page 4 completedCDwindow-91F3C32C6205BE9B9C9087337B8A81D9
Moved to page 4 completedCDwindow-4B41422677A13C7C8F8D030853A01566
Moved to page 4
Moved to page 4The Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
Moved to page 4 completedThe Product name is: 
	Moved to page 4 completedThe Product name is: 
		
		
		
		
		
		
		
		
		page 6Captain America (Lasercut) Notebook
		Moved to page 6 completedCaptain America (Metal Shield) Diary
		Moved to page 6 completedCaptain America 14 inch Laptop Sleeve - Blue
		Moved to page 6 completedCaptain America 14\
		Moved to page 6 completedCaptain America Action Figure by Diamond Select Toys
		Moved to page 6 completedCaptain America Printed Grey Hoodie - 2047
		Moved to page 6 completedCaptain America Printed Grey Hoodie - 2049
		Moved to page 6 completedCaptain America Printed Grey Hoodie - 2052
		Moved to page 6 completedCaptain America Printed Grey Hoodie - 2054
		Moved to page 6 completedCaptain America Printed Grey Sweatshirt - 2035
		Moved to page 6 completedCaptain America Printed Grey Sweatshirt - 2041
		Moved to page 6 completedCaptain America Printed Navy Hoodie - 2045
		Moved to page 6 completedCaptain America Printed Navy Hoodie - 2046
		Moved to page 6 completedCaptain America Printed Navy Hoodie - 2048
		Moved to page 6 completedCaptain America Printed Navy Hoodie - 2050
		Moved to page 6 completedCaptain America Printed Navy Hoodie - 2051
		Moved to page 6 completedCaptain America Printed Navy Hoodie - 2053
		Moved to page 6 completedCaptain America Printed Navy Sweatshirt - 2031
		Moved to page 6 completedCaptain America Printed Navy Sweatshirt - 2032
		Moved to page 6 completedCaptain America Printed Navy Sweatshirt - 2033
		Moved to page 6 completedCaptain America Printed Navy Sweatshirt - 2034
		Moved to page 6 completedCaptain America Printed Navy Sweatshirt - 2039
		Moved to page 6 completedCaptain America Printed Navy Sweatshirt - 2040
		Moved to page 6 completedCaptain America Printed Navy Sweatshirt - 2042	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	