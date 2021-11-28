/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foo;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author doquy
 */
public class Validator {
	public static String validateEmpty(JTextField field, String label){
		if(field.getText().equals("")){
			return label+ "KHONG DUOC DE TRONG";
		}
		return "";
	}
}
