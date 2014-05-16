package excel.copyandmove;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class ApacheMoveSheetWithinWorkbook
{
	public static void main(String[] args) throws Exception
	{
		Workbook wb = new HSSFWorkbook();
	    wb.createSheet("new sheet");
	    wb.createSheet("second sheet");
	    wb.createSheet("third sheet");

	    wb.setSheetOrder("second sheet", 0);
	    wb.setSheetOrder("new sheet", 1);
	    wb.setSheetOrder("third sheet", 2);
	    
	    FileOutputStream fileOut = new FileOutputStream("data/Apache_Reordered.xls");
	    wb.write(fileOut);
	    fileOut.close();
	    
	    //Print Message
        System.out.println("Reordered successfull.");
	}
}
