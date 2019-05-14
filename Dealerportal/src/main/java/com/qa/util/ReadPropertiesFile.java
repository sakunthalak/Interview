package com.qa.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	
	public Properties readAll(String fileName)
	{
		String file =System.getProperty("user.dir")+"\\files\\"+fileName;
		FileReader  Reader;
		
		Properties p=new Properties();
		
		try {
			Reader=new FileReader(file);
			p.load(Reader);
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}
	

}
