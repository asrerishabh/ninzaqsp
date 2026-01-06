package genericUtility;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readDataFromExcel(String sheetname,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{

	FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\NewNinza.xlsx");
	Workbook wb= WorkbookFactory.create(fis);

	String data=wb.getSheet(sheetname).getRow(rowNum).getCell(cellNum).getStringCellValue();

	wb.close();
	return data;

	}
}


