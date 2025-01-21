package dsAlgoUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {
	
	Row row;
	Cell cell;
	
	public static List<List<String>> DataFromExcel(String sheetName)
			throws IOException {
		
		List<List<String>> data = new ArrayList<>();

			FileInputStream file = new FileInputStream(

			System.getProperty("user.dir") +
			"\\src\\main\\resources\\DSAlgoExcelsheets\\ScenarioData.xlsx");

			XSSFWorkbook workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheet(sheetName);


			// Iterate through each row

			for (int i = 0; i <= sheet.getLastRowNum(); i++) {

			Row row = sheet.getRow(i);

			List<String> rowData = new ArrayList<>();


			if (row != null) {

			for (int j = 0; j < row.getLastCellNum(); j++) {

			Cell cell = row.getCell(j);

			String value = cell != null ? cell.toString() : "";

			rowData.add(value);

			}

			}


			data.add(rowData);

			}


			workbook.close();

			file.close();

			return data;

			}

}
