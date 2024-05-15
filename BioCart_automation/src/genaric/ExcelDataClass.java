package genaric;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ExcelDataClass implements Constants {
	public static Object getData(String excel_path, String sheetname, int row_number, int cell_number) {
		Object value = null;
		try {
			File f = new File(excel_path);
			FileInputStream fis = new FileInputStream(f);

			// create the workbook
			Workbook wb = WorkbookFactory.create(fis);

			Cell cell = wb.getSheet(sheetname).getRow(row_number).getCell(cell_number);

			// Check the cell type and print the value accordingly
			switch (cell.getCellType()) {
			case STRING:
				value = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					value = cell.getDateCellValue();
				} else {
					value = cell.getNumericCellValue();
				}
				break;
			case BOOLEAN:
				value = cell.getBooleanCellValue();
				break;
			case FORMULA:
				value = cell.getCellFormula();
				break;
			case BLANK:
				value = null;
				break;
			default:
				value = null;

			}
		}

		catch (Exception ex) {
			ex.printStackTrace();
			Reporter.log("Error fetching from excel");
		}

		return value;
	}
}
