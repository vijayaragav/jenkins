package fileHandling;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class FileReading {

    public static void fileReaderExample(String[] args) throws IOException {

        FileReader reader = new FileReader("C:\\Users\\karth\\Downloads\\chromedriver\\FileNew.txt");
        int i;
        while ((i = reader.read()) != -1) {
            System.out.println((char) i);
        }
        reader.close();

    }

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("C:\\Users\\karth\\Downloads\\chromedriver\\Login.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet("sheet1");
        //using for method
        /*int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();
        for (int r = 0; r <= rows; r++) {
            XSSFRow row = (XSSFRow) sheet.getRow(r);
            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                }
            }
            System.out.println("");
        }*/
        //using iterator
        Iterator iterator =sheet.iterator();
        while(iterator.hasNext()){
            XSSFRow row = (XSSFRow) iterator.next();
            Iterator<Cell> cellitr = row.cellIterator();
            while (cellitr.hasNext()){
                XSSFCell cell = (XSSFCell) cellitr.next();
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                }
            }
            System.out.println("");
        }
    }
}