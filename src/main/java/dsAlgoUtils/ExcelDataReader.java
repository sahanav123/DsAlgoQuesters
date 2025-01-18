package dsAlgoUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	public static List<Map<String, String>> DataFromExcel(String sheetName) throws IOException {
		List<Map<String, String>> data = new ArrayList<>();

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\resources\\DSAlgoExcelsheets\\TestDataforScenarios.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet(sheetName);

		// Get the header row (assume the first row contains headers)
		Row headerRow = sheet.getRow(0);
		if (headerRow == null) {
			throw new IllegalArgumentException("Sheet is empty or header row is missing.");
		}

		List<String> headers = new ArrayList<>();
		for (Cell headerCell : headerRow) {
			headers.add(headerCell.toString());
		}

		// Iterate through each data row (starting from the second row)
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			if (row != null) {
				Map<String, String> rowData = new HashMap<>();
				for (int j = 0; j < headers.size(); j++) {
					Cell cell = row.getCell(j);
					String value = cell != null ? cell.toString() : "";
					rowData.put(headers.get(j), value);
				}
				data.add(rowData);
			}
		}

		workbook.close();
		file.close();
		return data;
	}
}