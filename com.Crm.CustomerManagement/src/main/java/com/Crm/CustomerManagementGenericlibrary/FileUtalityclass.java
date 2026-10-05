package com.Crm.CustomerManagementGenericlibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/**
 * @author sreedhar
 * this class is a generic method which is used to read data from property
 */
public class FileUtalityclass {
	public String readdatafromproperty(String key) throws IOException {
        FileInputStream fis = new FileInputStream(Ipathconstants.propertypath);
        Properties p = new Properties();
        p.load(fis);
        String data = p.getProperty(key);

        return data;
    }
	public String readDatafromExcelStringData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Ipathconstants.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	 String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	public double readDatafromExcelNumericData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream(Ipathconstants.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	 double data=wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return data;
	
}
	public void updateDataintoExcel(String sheet,int row,int cell,String value) throws IOException {
		FileInputStream fis=new FileInputStream(Ipathconstants.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
FileOutputStream fos=new FileOutputStream(Ipathconstants.excelpath);
wb.write(fos);
wb.close();
	}

}		



