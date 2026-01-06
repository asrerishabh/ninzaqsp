import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\OneDrive\\Documents\\NewNinza.xlsx");
		Workbook wb= WorkbookFactory.create(fis);

		String data=wb.getSheet("Campaign").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);


	}

}
