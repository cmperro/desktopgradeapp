package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Vector;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


/** 
 * A simple working example of what it take to write an excel file based on
 * <a href="http://poi.apache.org/spreadsheet/how-to.html"> the apache how-to
 * </a>
 */
public class ExcelExample {

    public static void main(String[] args) throws IOException {

        Vector<Character> key = new Vector<Character>();
        Vector<Vector<Character>> students = new Vector<Vector<Character>>();

        InputStream input = new FileInputStream("inputtest.xls");
        HSSFWorkbook wb     = new HSSFWorkbook(input);

        HSSFSheet MainSheet = wb.getSheetAt(0);

        HSSFRow KeyRow    = MainSheet.getRow(3);
        HSSFCell QNumCell   = KeyRow.getCell(4);


        //double QNum = QNumCell.getNumericCellValue();
        
        for(int i=7; i<=20; i++ ){
            HSSFCell cell = KeyRow.getCell(i);
            key.add(cell.getRichStringCellValue());
        }

        System.out.println(key);


        System.out.println(QNumCell);
     
     
        /*try {
            FileOutputStream out = new FileOutputStream("workbook.xls");
            Workbook wb = new HSSFWorkbook();
            Sheet s = wb.createSheet(); 
            Row r = s.createRow(0);
            Cell c= r.createCell(0);
            c.setCellValue("Woot woot sandro!");
            wb.write(out);
            out.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }*/

    }
}
