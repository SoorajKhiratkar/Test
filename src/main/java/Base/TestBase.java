package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	
	public void initialization() throws Exception
	{
		String browserValue = readPropertyFile("browser");
		//if(readPropertyFile("browser").equals("chrome"))
		if(browserValue.equals("chrome"))
		{    
			System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
			driver= new ChromeDriver();
		}
		//else if(readPropertyFile("browser").equals("firefox"))
		else if(browserValue.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		//else if(readPropertyFile("browser").equals("edge"))
		else if(browserValue.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		//driver.get("https://kite.zerodha.com/");
		driver.get(readPropertyFile("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get(readExcelFile(0,0));
	}
	public String readExcelFile(int row,int col) throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Framework\\Test Data\\Book1.xlsx");
		Sheet excelSheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excelSheet.getRow(row).getCell(col).getStringCellValue();
	return value;
		
	}
	public String readPropertyFile(String value) throws Exception
	{
	Properties prop=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Framework\\Test Data\\config.properties");
	prop.load(file);
	return prop.getProperty(value);
	}
	public void captureScreenshotFailedTC(WebDriver driver) throws Exception
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Admin\\eclipse-workspace\\Framework\\Screenshot");
		FileHandler.copy(source, destination);
	}
}
