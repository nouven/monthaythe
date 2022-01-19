/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.DocGia;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.drawingml.x2006.main.STPresetColorVal;

/**
 *
 * @author doquy
 */
public class Print {
	public static boolean  Print(String header[], ArrayList<DocGia> list, String path){
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();
		Row row;
		Cell cell;
		row = sheet.createRow(2);
		for(int i = 0; i < header.length; i++){
			cell = row.createCell(i, CellType.STRING);
			cell.setCellValue(header[i]);
		}
		for(int i = 0; i < list.size(); i++){
			row = sheet.createRow(3 + i);
			cell = row.createCell(0, CellType.STRING);
			cell.setCellValue(list.get(i).getMaDocGia());
			cell = row.createCell(1, CellType.STRING);
			cell.setCellValue(list.get(i).getHoTen());
			cell = row.createCell(2, CellType.STRING);
			cell.setCellValue(list.get(i).getNgaySinh());
			cell = row.createCell(3, CellType.STRING);
			if(list.get(i).getGoiTinh() == 1){
				cell.setCellValue("nam");
			}else{
				cell.setCellValue("nu");
			}
			cell = row.createCell(4, CellType.STRING);
			cell.setCellValue(list.get(i).getSdt());
			cell = row.createCell(5, CellType.STRING);
			cell.setCellValue(list.get(i).getEmail());
			cell = row.createCell(6, CellType.STRING);
			cell.setCellValue(list.get(i).getDiaChi());
		}
		try {
			FileOutputStream fis = new FileOutputStream(new File(path));
			wb.write(fis);
			fis.close();
			MessDialog.showMessDialog(null, "xuất file thành công!!!", "INFO!!!");
			return true;
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
		}
		MessDialog.showErrorDialog(null, "xuất file thất bại!!", "ERROR!!");
		return false;
	}
}
