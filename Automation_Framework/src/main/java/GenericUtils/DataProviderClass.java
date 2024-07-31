package GenericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider
	public String[][] dataProviderMethod() {

		File f = new File(".//Test data//data.xlsx");
		Workbook workbook = null;
		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = WorkbookFactory.create(fis);
		}
		
		catch (Exception e) {
			
		}
		Sheet sheet = workbook.getSheet("Register credentials");
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] result = new String[rowcount - 1][cellcount];
		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				String data = sheet.getRow(i).getCell(j).toString();
				result[i - 1][j] = data;
			}
		}
		return result;
	}
}
