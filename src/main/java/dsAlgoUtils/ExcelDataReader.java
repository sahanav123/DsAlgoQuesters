package dsAlgoUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	
	 public static List<String> getDataFromExcel(String sheetName) throws IOException {
	        List<String> data = new ArrayList<>();
	        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\DSAlgoExcelsheets\\ScenarioData.xlsx");
	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	        XSSFSheet sheet = workbook.getSheet(sheetName);

	        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
	            Row row = sheet.getRow(i);
	            if (row != null) {
	                Cell cell = row.getCell(0); // First column
	                if (cell != null) {
	                    data.add(cell.getStringCellValue());
	                }
	            }
	        }

	        workbook.close();
	        file.close();
	        return data;
	    }
	 
//	 List<String[]> data = new ArrayList<>();
//     FileInputStream fis = new FileInputStream(filePath);
//     Workbook workbook = new XSSFWorkbook(fis);
//     Sheet sheet = workbook.getSheet(sheetName);
//
//     for (Row row : sheet) {
//         String[] rowData = new String[row.getLastCellNum()];
//         for (Cell cell : row) {
//             rowData[cell.getColumnIndex()] = cell.toString();
//         }
//         data.add(rowData);
//     }
//     workbook.close();
//     return data;
// }
}