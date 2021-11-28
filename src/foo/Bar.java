/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foo;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author doquy
 */
public class Bar {
	public static void resetTxt(JTextField[] listTxt){
		for(JTextField i: listTxt){
			i.setText("");
		}
	}
}
