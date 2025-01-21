package dsAlgoUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class ExcelReader {

    public static int totalRow;

    // Ensure thread-safe access to the workbook
    private static final ReentrantLock lock = new ReentrantLock();

    public List<Map<String, String>> getData(String excelFilePath, String sheetName)
            throws InvalidFormatException, IOException, OpenXML4JException {

        System.out.println("sheetName---->" + sheetName);
        lock.lock();
        try (OPCPackage pkg = OPCPackage.open(new File(excelFilePath))) {
            Workbook workbook = new XSSFWorkbook(pkg);
            System.out.println("workbook-------->" + workbook);
            Sheet sheet = workbook.getSheet(sheetName);
            System.out.println("sheet---->" + sheet);
            return readSheet(sheet);
        } finally {
            lock.unlock();
        }
    }

    private List<Map<String, String>> readSheet(Sheet sheet) {
        totalRow = sheet.getLastRowNum();
        System.out.println("totalRow--->" + totalRow);

        List<Map<String, String>> excelRows = new ArrayList<>();
        Row headerRow = sheet.getRow(sheet.getFirstRowNum());

        // Ensure the header row is valid
        if (headerRow == null) {
            throw new IllegalStateException("Header row is missing in the Excel sheet.");
        }

        // Read data rows
        for (int currentRow = 1; currentRow <= totalRow; currentRow++) {
            Row row = sheet.getRow(currentRow);
            if (row == null) {
                continue; // Skip empty rows
            }

            LinkedHashMap<String, String> columnMapData = new LinkedHashMap<>();
            for (int currentColumn = 0; currentColumn < row.getLastCellNum(); currentColumn++) {
                String columnHeaderName = null;
                Cell headerCell = headerRow.getCell(currentColumn);
                if (headerCell != null) {
                    columnHeaderName = headerCell.getStringCellValue();
                } else {
                    continue; // Skip missing header cells
                }

                Cell cell = row.getCell(currentColumn);
                String cellValue = "";

                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            cellValue = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            cellValue = String.valueOf(cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            cellValue = String.valueOf(cell.getBooleanCellValue());
                            break;
                        case FORMULA:
                            cellValue = cell.getCellFormula();
                            break;
                        case BLANK:
                        default:
                            cellValue = "";
                            break;
                    }
                }
                columnMapData.put(columnHeaderName, cellValue);
            }
            excelRows.add(columnMapData);
        }

        return excelRows;
    }

    public int countRow() {
        return totalRow;
    }
}