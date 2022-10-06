package excel_SheetHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data_FromEXcelSheet {

	public void excel() throws EncryptedDocumentException, IOException {
		String path = "C:\\velocityTraining\\setups\\Excel_Sheets\\Sheet1.xlsx";
		FileInputStream file= new FileInputStream(path);
	    Sheet E1 = WorkbookFactory.create(file).getSheet("sheet1");
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    	System.out.print(E1.getRow(i).getCell(j)+"\t");
	    	}
	    	System.out.println();
	    }
	}
	public static void main(String [] args) throws EncryptedDocumentException, IOException {
		Fetch_Data_FromEXcelSheet a = new Fetch_Data_FromEXcelSheet();
		a.excel();
	}
}
