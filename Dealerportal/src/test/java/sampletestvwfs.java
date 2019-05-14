

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class sampletestvwfs {

	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poorn\\eclipse-workspace\\com.VFS\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
//		DateFormat formatter=new SimpleDateFormat("MM dd yyyy HH:mm");
//		
//		//DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd MM YYYY : HH :MM ");
//		String title1=driver.findElement
//				(By.xpath("//*[@id=\"dlg-dealersearch-title\"]")).getText();
//		System.out.println(title1);
//		Assert.assertEquals(title1, "Drive Away Insurance");
		
		
		
		String vehicle="OV12UYY";
		

		
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher matcher = pattern.matcher(vehicle);
		if (matcher.matches()) {
			System.out.println("OV12UYYfd");
			//coverchkpage.regNumber(vehicle);
		}
		else
			System.out.println("invalid Reg number");
		
		
		
		
//		
//		
//		driver.findElement(By.id("vehicleReg")).sendKeys(vehicle);
//		driver.findElement(By.name("btnfind")).click();
//		Thread.sleep(5000);
//		String string1=driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[4]/div[1]")).getText();
//		
//		boolean isfound=string1.contains(vehicle);
//		
//		if(isfound==true)
//		System.out.println("vehicle insurance is exists");
//		else
//			System.out.println("vehicle not exists");
//		
//		String coverstart=driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[4]/div[2]/span")).getText();
//		System.out.println(coverstart);
//		LocalDate date1=LocalDate.of(coverstart);
//		System.out.println(date1);
//		String coverend=driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[4]/div[3]/span")).getText();
//		System.out.println(coverend);
//		Date date2=formatter.parse(coverend);	
		
	
		
	}

}
