package PO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Globalprop
{
public static Properties property() throws IOException
{
	Properties prop = new Properties();
	try
	{
	   FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/GlobalData.properties");

	    prop.load(file);

	} 
	catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
	return prop;
}
}
