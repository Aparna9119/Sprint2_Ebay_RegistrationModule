package readdata;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData1 {
	@SuppressWarnings("resource")
	public static String readExcel(int row , int column) {
		String testData=null;
		try{
			String filePath = System.getProperty("user.dir")+"//Excel//TestData.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wbs = new XSSFWorkbook(file);
			XSSFSheet wss = wbs.getSheetAt(0);
			testData = String.valueOf(wss.getRow(row).getCell(column));
			//System.out.println(testData);
		}
		catch(Exception e)
		{
			System.out.println("Read excel");
		}
		return testData;
}
	
	public static String config(String dt) {
		try {
			String filelocation = System.getProperty("user.dir") + "\\Application_Configuration\\Config.properties";
			File file = new File(filelocation);
			FileInputStream fileinput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileinput);
			String data= prop.getProperty(dt);
			return data;
		}
		catch(Exception e)
		{
			System.out.println("Read ");
			}
		return null;
		
	}
	}