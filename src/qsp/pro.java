package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class pro
{


	private static String URL;

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		 p.load(new FileInputStream("./property/config.properties"));
		String v = p.getProperty("ITO");
		System.out.println(v);
		// TODO Auto-generated method stub

	}


	}

	
	


