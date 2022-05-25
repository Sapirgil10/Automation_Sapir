package Helpers;

import io.qameta.allure.Description;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;

public class excelDiffer {

    @Test(description = " Test_01: Verify excel differences ")
    @Description(" Test description: Cell vs Cell compare")
    public void sheetDiffer() throws Exception {
        Workbook ActualWorkbook = new XSSFWorkbook(new File("src/test/resources/Excel/Actual result from algo/Actual.xlsx"));
        File ExpectedWorkbookFolder = new File("src/test/resources/Excel/Expected");
        Workbook ExpectedWorkbook;
        for (File excelFile : ExpectedWorkbookFolder.listFiles()) {
            if (excelFile.getName().contains("DS_Store"))
                continue;

            ExpectedWorkbook = new XSSFWorkbook(excelFile);
            System.out.println("---------------------------------------------------------------------------");
            System.out.println();
            System.out.println("Running on Excel sheet: " + ">>> " + excelFile.getName() + " <<<");
            Sheet actualSheet = ActualWorkbook.getSheetAt(0);
            Sheet expectedSheet = ExpectedWorkbook.getSheetAt(0);

            for (int i = 0; i < actualSheet.getPhysicalNumberOfRows(); i++) {
                Row rowTemp = actualSheet.getRow(i);
                for (int j = 0; j < rowTemp.getPhysicalNumberOfCells(); j++) {
                    if (rowTemp.getCell(j) == null) {
                        if (expectedSheet.getRow(i).getCell(j) != null) {
                            System.out.println("Cell number: " + j + " on row: " + i + " must be empty");
                        }
                        continue;

                    }
                    boolean result = false;
                    Cell some = expectedSheet.getRow(i).getCell(j);
                    if (some == null) {
                    } else if (!rowTemp.getCell(j).getCellType().equals(some.getCellType())) {
                        result = false;
                    } else
                        switch (rowTemp.getCell(j).getCellType()) {
                            case STRING:
                                result = rowTemp.getCell(j).getRichStringCellValue().getString()
                                        .equals(expectedSheet.getRow(i).getCell(j).getRichStringCellValue().getString());
                                break;
                            case NUMERIC:
                                result = rowTemp.getCell(j).getNumericCellValue()
                                        == (expectedSheet.getRow(i).getCell(j).getNumericCellValue());
                                break;
                            case BOOLEAN:
                                result = rowTemp.getCell(j).getBooleanCellValue()
                                        == (expectedSheet.getRow(i).getCell(j).getBooleanCellValue());
                                break;
                            case FORMULA:
                                result = rowTemp.getCell(j).getCellFormula()
                                        .equals(expectedSheet.getRow(i).getCell(j).getCellFormula());
                                break;
                            default:
                                System.out.println("CASE FAIL " + rowTemp.getCell(j).getCellType());
                        }

                    if (!result) {
                        System.out.println("Actual ALGO result is: " + ">> " + rowTemp.getCell(j).toString() + " <<");
                        System.out.println("But presents:          " + ">> " + expectedSheet.getRow(i).getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).toString() + " <<");
                        System.out.println();
                    }
                    ExpectedWorkbook.close();
                }
            }
        }
    }
}
