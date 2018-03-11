package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel
{
	public static int getcolumncount(String path,String sheet,int r)
	{
		int cc=0;
			
		try
		{
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		cc=wb.getSheet(sheet).getRow(r).getLastCellNum();
			}
		catch(Exception e)
		{
			
		}
		return cc;
}

public static String getvalue(String path,String sheet,int r, int c) 
{
	String v="";
	try
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
	v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
	catch(Exception e)
	{
		
	}
	return v;

}

public static int getrownum(String path,String sheet)
{
	int rc=0;
	
	try
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
	rc=wb.getSheet(sheet).getLastRowNum();
		}
	catch(Exception e)
	{
		
	}
	return rc;
}
	
}

