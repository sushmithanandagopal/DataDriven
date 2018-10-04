package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String details(String file,String sheet,int row,int cell)
	{
		String s=" ";
		FileInputStream f;
		try {
			f = new FileInputStream(file);
			Workbook wb= WorkbookFactory.create(f);
			s=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		} 
		catch (Exception e) 
		{
			
		}
		return s;
		
	}

}
