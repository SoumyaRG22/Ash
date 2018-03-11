package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class autoutil
{
public static String getphoto(WebDriver driver,String folder)
	{
		String path="";
		try
		{
	String d=new Date(0).toString();
	String dateTime=d.replaceAll(":","_");
	path=folder+dateTime+".png";
	TakesScreenshot t=(TakesScreenshot)driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File(path));
		}
		catch(Exception e)
		{
		}
		return path;
		}
public static String getproperty(String path,String key)
{
	String v="";
	try
	{
	Properties p=new Properties();
	p.load(new FileInputStream(path));
	v=p.getProperty(key);
}
catch(Exception e)
{
}
return v;
}
}
	
	



