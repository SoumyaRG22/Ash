package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoConst
{
	public WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		}
	@BeforeMethod(alwaysRun=true)
	public void OpenApp()
	{
		String appurl=autoutil.getproperty(CONFIG_PATH,"URL");
		String strITO=autoutil.getproperty(CONFIG_PATH, "ITO");
		Long ITO=Long.parseLong(strITO);
		driver=new ChromeDriver();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
}
	@AfterMethod(alwaysRun=true)
	public void closeApp(ITestResult testResult)
	{
		  String name = testResult.getName();
		  int status = testResult.getStatus();
		  if(status==1)
		  {
			  Reporter.log(name+"is PASSED",true);
		  }
		  else
		  {
			  Reporter.log(name+"is FAILED",true);
			  autoutil.getphoto(driver,IMG_PATH);
		  }
		  driver.close();
			  
			   }
		  
		 }
